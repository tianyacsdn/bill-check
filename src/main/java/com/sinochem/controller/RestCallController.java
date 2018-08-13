package com.sinochem.controller;

import com.sinochem.service.RestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestCallController {
    private final RestService restService;

    public RestCallController(RestService restService) {
        this.restService = restService;
    }

    @RequestMapping("/query")
    public Map getSubAccountBalance() {
        Map<String, Object> result = new HashMap<>();
        Object obj = restService.getSubAccountBalance();
        result.put("data", obj);
        return result;
    }
}
