package com.sinochem.controller;

import com.sinochem.domain.AcpsBalanceCheckTask;
import com.sinochem.service.AcpsBalanceCheckTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    AcpsBalanceCheckTaskService acpsBalanceCheckTaskService;

    @RequestMapping("/query")
    public Map listTask() {
        Map map = new HashMap();
        List<AcpsBalanceCheckTask> list = acpsBalanceCheckTaskService.listCheckTask();
        map.put("data", list);
        return map;
    }
}
