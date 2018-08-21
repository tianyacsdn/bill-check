package com.sinochem.controller;

import com.sinochem.domain.BillBalanceMistake;
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
    BillBalanceMistakeService billBalanceMistakeService;

    @RequestMapping(value = "/add")
    public Map addMistake(@RequestBody BillBalanceMistake record) {
        Map map = new HashMap();
        boolean flag = billBalanceMistakeService.addMistake(record);
        map.put("msg", flag);
        return map;
    }

    @RequestMapping(value = "/query")
    public Map listMistake() {
        Map map = new HashMap();
        List<BillBalanceMistake> list = billBalanceMistakeService.listMistake();
        map.put("data", list);
        return map;
    }
}
