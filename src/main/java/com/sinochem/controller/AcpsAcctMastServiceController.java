package com.sinochem.controller;

import com.sinochem.domain.AcpsAcctMast;
import com.sinochem.service.AcpsAcctMastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/acps")
public class AcpsAcctMastServiceController {
    @Autowired
    AcpsAcctMastService acpsAcctMastService;

    @RequestMapping(value = "/query")
    public Map queryAcpsAcctMast() {
        Map result = new HashMap();
        List<AcpsAcctMast> list = acpsAcctMastService.listAcpsAcctMast();
        result.put("data", list);
        return result;
    }

    @RequestMapping(value = "/update")
    public Map update(@RequestBody AcpsAcctMast record) {
        Map result = new HashMap();
        boolean flag = acpsAcctMastService.updateByMastAcctNum(record);
        result.put("msg", flag);
        return result;
    }
}
