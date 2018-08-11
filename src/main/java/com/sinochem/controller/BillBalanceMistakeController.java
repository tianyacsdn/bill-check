package com.sinochem.controller;

import com.sinochem.domain.BillBalanceMistake;
import com.sinochem.service.BillBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
}
