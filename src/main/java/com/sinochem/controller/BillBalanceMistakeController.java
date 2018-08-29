package com.sinochem.controller;

import com.sinochem.cps.BillBalanceMistakeCpsService;
import com.sinochem.domain.BillBalanceMistake;
import com.sinochem.domain.BillBankBalance;
import com.sinochem.service.BillBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/mistake")
public class BillBalanceMistakeController {
    @Autowired
    BillBalanceMistakeCpsService billBalanceMistakeCpsService;

    @RequestMapping(value = "/add")
    public Map addMistake(@RequestBody BillBalanceMistake record) {
        Map map = new HashMap();
        boolean flag = billBalanceMistakeCpsService.addMistake(record);
        map.put("msg", flag);
        return map;
    }

    @RequestMapping(value = "/query")
    public Map listMistake() {
        Map map = new HashMap();
        List<BillBalanceMistake> list = billBalanceMistakeCpsService.listMistake();
        map.put("data", list);
        return map;
    }

    @RequestMapping(value = "/insertBatch")
    public Map insertBatch(@RequestBody(required = true) List<BillBalanceMistake> mistakes) {
        Map<String, Object> result = new HashMap<>();
        boolean flag = billBalanceMistakeCpsService.insertBatch(mistakes);
        result.put("msg", flag);
        return result;
    }
}
