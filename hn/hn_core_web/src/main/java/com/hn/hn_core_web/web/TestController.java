package com.hn.hn_core_web.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "/html/index";
    }

    @Autowired
    private RestTemplate restTemplate;

    /*private final RestTemplate restTemplate;

    public TestController (RestTemplate restTemplate){

        this.restTemplate = restTemplate ;
    }*/

    @GetMapping("/test")
    public String testGetList2 (Class responseType){

        ResponseEntity<String> forEntity = this.restTemplate.getForEntity("http://localhost:8087/test/testGetList", String.class);
        return forEntity.getBody();
    }


}
