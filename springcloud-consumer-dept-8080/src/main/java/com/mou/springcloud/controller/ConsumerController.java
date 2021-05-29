package com.mou.springcloud.controller;


import com.mou.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @RequestMapping("/consumer/add")
    public boolean deptAdd(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/post/add",dept,boolean.class);
    }
    @RequestMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,Dept.class);
    }
    @RequestMapping("/consumer/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/get/list",List.class);
    }
}
