package com.xp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//服务注册与发现,从Spring Cloud Edgware开始,@EnableDiscoveryClient 或@EnableEurekaClient 可省略.
//只需加上相关依赖,并进行相应配置,即可将微服务注册到服务发现组件上
@EnableDiscoveryClient
@EnableFeignClients   //开启feign功能
public class SpringcloudConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerApp.class, args);
    }
}
