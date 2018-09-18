package com.sinochem.controller;

import com.sinochem.cps.BalanceRealTimeCheckCpsService;
import com.sinochem.domain.BalanceRealTimeCheck;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Api(value = "余额对账API", description = "余额对账向账务系统提供的API")
@Slf4j
public class BalanceRealTimeCheckController {
    private final BalanceRealTimeCheckCpsService balanceRealTimeCheckCpsService;

    public BalanceRealTimeCheckController(BalanceRealTimeCheckCpsService balanceRealTimeCheckCpsService) {
        this.balanceRealTimeCheckCpsService = balanceRealTimeCheckCpsService;
    }

    @RequestMapping(value = "/add")
    @ApiOperation(value = "")
    public Map<String, Object> insertBalanceRealTimeCheck(@RequestBody BalanceRealTimeCheck record) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceRealTimeCheckCpsService.insert(record);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/addbatch")
    public Map<String, Object> insertBatch(@RequestBody List<BalanceRealTimeCheck> records) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceRealTimeCheckCpsService.insertBatch(records);
        result.put("msg", num);
        return result;
    }

    @RequestMapping(value = "/query")
    @ApiOperation(value = "")
    public Map<String, Object> listBalanceRealTimeCheck(@RequestParam String gatewayChannel,
                                                        @RequestParam String startDate,
                                                        @RequestParam String endDate) {
        Map<String, Object> result = new HashMap<>();
        List<BalanceRealTimeCheck> list = balanceRealTimeCheckCpsService.listBalanceRealTimeCheck(gatewayChannel, startDate, endDate);
        result.put("Data", list);
        return result;
    }
}
