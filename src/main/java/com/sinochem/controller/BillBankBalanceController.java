package com.sinochem.controller;

import com.sinochem.cps.BillBankBalanceCpsService;
import com.sinochem.domain.BillBankBalance;
import com.sinochem.service.BillBankBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/balance")
public class BillBankBalanceController {
    @Autowired
    BillBankBalanceCpsService billBankBalanceCpsService;

    @RequestMapping(value = "/query")
    public Map listBalance() throws Exception{
        Map<String, Object> result = new HashMap<>();
        List<BillBankBalance> list = billBankBalanceCpsService.listBillBankBalance();
        result.put("data", list);
        return result;

    }

    @RequestMapping(value = "/queryByBillDate")
    public Map listBalanceByBillDat(@RequestParam(required = false)String billDate) throws Exception{
        Map<String, Object> result = new HashMap<>();
        List<BillBankBalance> list = billBankBalanceCpsService.listBillBankBalance(billDate);
        result.put("data", list);
        return result;
    }
}
