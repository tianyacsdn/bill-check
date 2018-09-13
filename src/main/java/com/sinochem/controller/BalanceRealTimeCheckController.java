package com.sinochem.controller;

import com.sinochem.cps.BalanceRealTimeCheckCpsService;
import com.sinochem.domain.BalanceRealTimeCheck;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tom
 */
@RestController
@RequestMapping(value = "/balance/realtime")
public class BalanceRealTimeCheckController {
    private final BalanceRealTimeCheckCpsService balanceRealTimeCheckCpsService;

    public BalanceRealTimeCheckController(BalanceRealTimeCheckCpsService balanceRealTimeCheckCpsService) {
        this.balanceRealTimeCheckCpsService = balanceRealTimeCheckCpsService;
    }

    @RequestMapping(value = "/add")
    public Map<String, Object> insertBalanceRealTimeCheck(@RequestBody BalanceRealTimeCheck record) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceRealTimeCheckCpsService.insert(record);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/add/batch")
    public Map<String, Object> insertBalanceRealTimeCheck(@RequestBody List<BalanceRealTimeCheck> records) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceRealTimeCheckCpsService.insertBatch(records);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/query")
    public Map<String, Object> listBalanceRealTimeCheck(@RequestParam String gatewayChannel,
                                                        @RequestParam String startDate,
                                                        @RequestParam String endDate) {
        Map<String, Object> result = new HashMap<>();
        List<BalanceRealTimeCheck> list = balanceRealTimeCheckCpsService.listBalanceRealTimeCheck(gatewayChannel, startDate, endDate);
        result.put("Data", list);
        return result;
    }
}
