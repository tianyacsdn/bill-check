package com.sinochem.remote.impl;

import com.sinochem.domain.RemoteResponse;
import com.sinochem.remote.RemoteService;
import com.sinochem.util.JsonUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RemoteServiceImpl implements RemoteService {
    private final RestTemplate restTemplate;

    public RemoteServiceImpl(RestTemplate restTemplate) {
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
        RemoteResponse obj = restTemplate.postForObject("http://localhost:16000/acps/balancebyacctnum",formEntity,RemoteResponse.class);
        return obj;
    }
}
