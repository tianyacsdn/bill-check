package com.sinochem.service.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.mapper.BillBankBalanceMapper;
import com.sinochem.parse.BalanceBillFactory;
import com.sinochem.parse.PingAnBalanceBillFactory;
import com.sinochem.parse.TxtBalanceBill;
import com.sinochem.service.ParseBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.util.Date;
import java.util.List;

@Service
public class ParseBillServiceImpl implements ParseBillService {

    @Autowired
    BillBankBalanceMapper billBankBalanceMapper;

    @Override
    public List<BillBankBalance> parseBill() throws Exception {
        BalanceBillFactory factory = new PingAnBalanceBillFactory();
        TxtBalanceBill txtBalanceBill = factory.build();
        List<BillBankBalance> list = txtBalanceBill.parse("E:" + File.separator + "FTP");
        return list;
    }

    @Override
    @Transactional
    public boolean loadBill() throws Exception{
        List<BillBankBalance> billList = parseBill();
        for (int i = 0; i < billList.size(); i++) {
            BillBankBalance billBankBalance = billList.get(i);
            billBankBalance.setCreateTime(new Date());
            billBankBalance.setOptId(001L);
            int num = billBankBalanceMapper.insert(billBankBalance);
            if (num != 1) {
                throw new Exception("账单导入数据库失败");
            }
        }
        return true;
    }
}
