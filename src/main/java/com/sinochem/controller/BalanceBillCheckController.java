package com.sinochem.controller;

import com.sinochem.cps.BalanceBillCheckCpsService;
import com.sinochem.domain.BalanceBillCheck;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/balance/bill")
public class BalanceBillCheckController {
    private final BalanceBillCheckCpsService balanceBillCheckCpsService;

    public BalanceBillCheckController(BalanceBillCheckCpsService balanceBillCheckCpsService) {
        this.balanceBillCheckCpsService = balanceBillCheckCpsService;
    }

    @RequestMapping(value = "/add")
    public Map<String, Object> add(@RequestBody BalanceBillCheck record) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceBillCheckCpsService.insert(record);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/addbatch")
    public Map<String, Object> addBatch(@RequestBody List<BalanceBillCheck> records) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceBillCheckCpsService.insertBatch(records);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/query")
    public Map<String, Object> queryByBillDate(@RequestParam String gatewayChannel,
                                           @RequestParam String billDate) {
        Map<String, Object> result = new HashMap<>();
        List<BalanceBillCheck> list = balanceBillCheckCpsService.listDataByBillDate(gatewayChannel, billDate);
        result.put("data", list);
        return result;
    }
}
