package com.xp.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    // 定义resttemplate对象注入到容器中
    @Bean
    public RestTemplate restTemplat(){
        return new RestTemplate();
    }

}
