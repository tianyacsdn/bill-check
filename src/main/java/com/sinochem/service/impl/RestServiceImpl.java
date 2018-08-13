package com.sinochem.service.impl;

import com.sinochem.service.RestService;
import com.sinochem.util.JsonUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestServiceImpl implements RestService {

    private final RestTemplate restTemplate;

    public RestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Object getSubAccountBalance() {
        Map<String, String> param = new HashMap<>();
        param.put("acctNum", "3357000000001097");
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        String reqParam = JsonUtil.jsonStr(param);
        HttpEntity<String> formEntity = new HttpEntity<String>(reqParam, headers);
        Object obj = restTemplate.postForObject("http://127.0.0.1:8080/balance/query",formEntity,Object.class);
        return obj;
    }
}
