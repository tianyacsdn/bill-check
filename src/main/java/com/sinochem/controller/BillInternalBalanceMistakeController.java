package com.sinochem.controller;

import com.sinochem.cps.BillInternalBalanceMistakeCpsService;
import com.sinochem.domain.BillInternalBalanceMistake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/internal/mistake")
public class BillInternalBalanceMistakeController {
    @Autowired
    BillInternalBalanceMistakeCpsService billInternalBalanceMistakeCpsService;

    @RequestMapping(value = "/add")
    public Map add(@RequestBody BillInternalBalanceMistake record) {
        Map<String, Object> result = new HashMap<>();
        boolean flag = billInternalBalanceMistakeCpsService.addMistake(record);
        result.put("msg", flag);
        return result;
    }

    @RequestMapping(value = "/query")
    public Map listMistake() {
        Map<String, Object> result = new HashMap<>();
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeCpsService.listMistake();
        result.put("data", list);
        return result;
    }

    @RequestMapping(value = "/querybycheckstatus")
    public Map getMistakeByCheckStatus(@RequestBody BillInternalBalanceMistake record) {
        Map<String, Object> result = new HashMap<>();
        int checkStatus = record.getCheckStatus();
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeCpsService.getMistakeByCheckStatus(checkStatus);
        result.put("data", list);
        return result;
    }

    @RequestMapping(value = "/update")
    public Map update(@RequestBody BillInternalBalanceMistake record) {
        Map<String, Object> result = new HashMap<>();
        boolean flag = billInternalBalanceMistakeCpsService.update(record);
        result.put("msg", flag);
        return result;
    }
}
