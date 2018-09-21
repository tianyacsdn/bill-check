package com.sinochem.controller;

import com.github.pagehelper.PageInfo;
import com.sinochem.BalanceInnerCheckDTO;
import com.sinochem.domain.BalanceInnerCheck;
import com.sinochem.service.BalanceInnerCheckService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/balance/inner")
public class BalanceInnerCheckController {
    private final BalanceInnerCheckService balanceInnerCheckService;

    public BalanceInnerCheckController(BalanceInnerCheckService balanceInnerCheckService) {
        this.balanceInnerCheckService = balanceInnerCheckService;
    }

    @RequestMapping(value = "/query")
    public Map<String, Object> listData(@RequestBody BalanceInnerCheck param) {
        Map<String, Object> result = new HashMap<>();
        List<BalanceInnerCheck> list = balanceInnerCheckService.listBalanceInnerCheck(param);
        result.put("data", list);
        return result;
    }

    @RequestMapping(value = "/querybypage")
    public Map<String, Object> listDataByPage(@RequestBody BalanceInnerCheckDTO param) {
        Map<String, Object> result = new HashMap<>();
        PageInfo pageInfo = balanceInnerCheckService.listBalanceInnerCheckByPage(param);
        result.put("data", pageInfo);
        return result;
    }

    @RequestMapping(value = "/add")
    private Map<String, Object> listDataByPage(@RequestBody BalanceInnerCheck record) {
        Map<String, Object> result = new HashMap<>();
        int num = balanceInnerCheckService.insert(record);
        result.put("data", num);
        return result;
    }
}
