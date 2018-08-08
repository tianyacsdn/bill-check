package com.sinochem.controller;

import com.sinochem.service.ParseBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/balance")
public class BillParseController {

    @Autowired
    ParseBillService parseBillService;

    @RequestMapping(value = "/parse")
    public Map parseBill() throws Exception {
        Map<String, Object> map = new HashMap<>();
        List list = parseBillService.parseBill();
        map.put("data", list);
        return map;
    }

    @RequestMapping(value = "/load")
    public Map loadBill() throws Exception {
        Map<String, Object> map = new HashMap<>();
        boolean flag = parseBillService.loadBill();
        if (flag) {
            map.put("msg", "账单导入数据库成功！");
        } else {
            map.put("msg", "账单导入数据库失败#");
        }
        return map;
    }
}
