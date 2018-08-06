package com.sinochem.service.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.domain.BillBankBalanceExample;
import com.sinochem.mapper.BillBankBalanceMapper;
import com.sinochem.service.BillBankBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillBankBalanceServiceImpl implements BillBankBalanceService {

    @Autowired
    BillBankBalanceMapper billBankBalanceMapper;

    @Override
    public List<BillBankBalance> listBillBankBalanceService() {
        BillBankBalanceExample example = new BillBankBalanceExample();
        BillBankBalanceExample.Criteria criteria = example.createCriteria();
        List<BillBankBalance> list = billBankBalanceMapper.selectByExample(example);
        return list;
    }
}
