package com.sinochem.service.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.mapper.BillBankBalanceMapper;
import com.sinochem.parse.BalanceBillFactory;
import com.sinochem.parse.TxtBalanceBill;
import com.sinochem.parse.impl.PABBalanceBillFactory;
import com.sinochem.service.ParseBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.util.Date;
import java.util.List;

@Service
public class ParseBillServiceImpl implements ParseBillService {

    @Value("${ftp.PAB.localBasePath}")
    private String localBasePath;
    @Value("${ftp.PAB.YEPath}")
    private String balancePath;

    @Autowired
    BillBankBalanceMapper billBankBalanceMapper;

    @Override
    public List<BillBankBalance> parseBill() throws Exception {
        BalanceBillFactory factory = new PABBalanceBillFactory();
        TxtBalanceBill txtBalanceBill = factory.build();
        List<BillBankBalance> list = txtBalanceBill.parse(localBasePath + File.separator + balancePath);
        return list;
    }

    @Override
    public List parseBillByDate(String billDate) throws Exception {
        BalanceBillFactory factory = new PABBalanceBillFactory();
        TxtBalanceBill txtBalanceBill = factory.build();
        List<BillBankBalance> list = txtBalanceBill.parse(localBasePath + File.separator + balancePath, billDate);
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

    @Override
    public boolean loadBillByBillDate(String billDate) throws Exception {
        List<BillBankBalance> billList = parseBillByDate(billDate);
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
