package com.xp.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 该接口对服务提供者的controller的handler进行映射
 */

@FeignClient(value = "springcloud-provider",path = "/provider")
public interface UserClientService {

    @RequestMapping(value = "/user/insert")
    public Map<String,Object> insert();


    @RequestMapping(value = "/user/getUsers",produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"})
    public Map<String,Object> getUsers();
}
