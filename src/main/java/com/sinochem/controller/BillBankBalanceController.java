package com.sinochem.controller;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.service.BillBankBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/balance")
public class BillBankBalanceController {

    @Autowired
    BillBankBalanceService billBankBalanceService;

    @RequestMapping(value = "/query")
    public Map listBalance() {
        Map<String, Object> map = new HashMap<>();
        List<BillBankBalance> list = billBankBalanceService.listBillBankBalanceService();
        map.put("data", list);
        return map;

    }

}
