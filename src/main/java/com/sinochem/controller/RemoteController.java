package com.sinochem.controller;

import com.sinochem.remote.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/remote")
public class RemoteController {
    @Autowired
    RemoteService remoteService;

    @RequestMapping("/query")
    public Map getSubAccountBalance() {
        Map<String, Object> result = new HashMap<>();
        Object obj = remoteService.getSubAccountBalance();
        result.put("data", obj);
        return result;
    }
}
