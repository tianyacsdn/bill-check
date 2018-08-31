package com.sinochem.service.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.domain.BillBankBalanceExample;
import com.sinochem.mapper.BillBankBalanceMapper;
import com.sinochem.service.BillBankBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class BillBankBalanceServiceImpl implements BillBankBalanceService {

    @Value("${ftp.PAB.hostname}")
    private String hostname;
    @Autowired
    BillBankBalanceMapper billBankBalanceMapper;

    @Override
    public List<BillBankBalance> listBillBankBalance() throws Exception {
        BillBankBalanceExample example = new BillBankBalanceExample();
        BillBankBalanceExample.Criteria criteria = example.createCriteria();
        List<BillBankBalance> list = billBankBalanceMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<BillBankBalance> listBillBankBalance(String billDate) throws Exception {
        BillBankBalanceExample example = new BillBankBalanceExample();
        BillBankBalanceExample.Criteria criteria = example.createCriteria();
        criteria.andBillDateEqualTo(new SimpleDateFormat("yyyyMMdd").parse(billDate));
        List<BillBankBalance> list = billBankBalanceMapper.selectByExample(example);
        return list;
    }
}
