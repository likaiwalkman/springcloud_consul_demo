package com.xp.springcloud.controller;

import com.xp.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/consumer")
public class UserController {

    //注入resttemplate对象,用于服务调用,正式环境中要使用feign
    @Autowired
    private RestTemplate restTemplate;

    //注入feign接口,使用feign进行服务调用
    @Autowired
    private UserClientService userClientService ;


    //服务提供者地址
    private static final String REST_URL_PREFIX = "http://localhost:8001/provider";

    @GetMapping(value = "/user/getUsers")
    public Map<String,Object> getUsers(){
        Map<String,Object> result=new HashMap<String, Object>();

        try {
            result=this.restTemplate.getForObject(REST_URL_PREFIX+"/user/getUsers", Map.class);

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }


    @GetMapping(value = "/user/getUsers2")
    public Map<String,Object> getUsers2(){
        Map<String,Object> result=new HashMap<String, Object>();

        try {

            result = userClientService.getUsers();

        } catch (Exception ex){
            ex.printStackTrace();
        }

        return result;
    }

}
