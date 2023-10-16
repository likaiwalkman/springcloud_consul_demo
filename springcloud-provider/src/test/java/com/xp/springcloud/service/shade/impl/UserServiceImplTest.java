package com.xp.springcloud.service.shade.impl;

import com.xp.springcloud.service.shade.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@OverrideAutoConfiguration(enabled = false)
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
@DataRedisTest
public class UserServiceImplTest  {

    @Resource private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testGetUsers() {
        System.out.println();
    }
}