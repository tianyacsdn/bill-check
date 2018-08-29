package com.sinochem.cps.impl;

import com.sinochem.cps.BillBankBalanceCpsService;
import com.sinochem.domain.BillBankBalance;
import com.sinochem.service.BillBankBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillBankBalanceCpsServiceImpl implements BillBankBalanceCpsService {
    @Autowired
    BillBankBalanceService billBankBalanceService;

    @Override
    public List<BillBankBalance> listBillBankBalance() throws Exception {
        List<BillBankBalance> list = billBankBalanceService.listBillBankBalance();
        return list;
    }

    @Override
    public List<BillBankBalance> listBillBankBalance(String billDate) throws Exception {
        List<BillBankBalance> list = billBankBalanceService.listBillBankBalance(billDate);
        return list;
    }
}
