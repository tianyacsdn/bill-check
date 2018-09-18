package com.sinochem.service.impl;

import com.sinochem.service.RestService;
import com.sinochem.util.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${restUrl.balanceQuery}")
    private String balanceQueryUrl;

    @Override
    public Object getSubAccountBalance() {
        Map<String, String> param = new HashMap<>();
        param.put("acctNum", "3357000000001097");
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        String reqParam = "";
        try {
            reqParam = JsonUtil.jsonStr(param);
        } catch (Exception e) {

        }
        HttpEntity<String> formEntity = new HttpEntity<String>(reqParam, headers);
        Object obj = restTemplate.postForObject(balanceQueryUrl,formEntity,Object.class);

        return obj;
    }
}
