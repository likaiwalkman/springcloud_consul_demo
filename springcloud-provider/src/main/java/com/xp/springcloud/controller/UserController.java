package com.xp.springcloud.controller;

import com.xp.springcloud.pojo.User;
import com.xp.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/provider")
public class UserController {

    //自动注入service
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/user/getUsers",produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"})
    public Map<String,Object> getUsers(){
        Map<String,Object> result= new HashMap<String, Object>();

        try {
            //List<User> users = iUserService.getUsers();

            //返回结果
            //result.put("datas",users);
            result.put("status","200");
            result.put("msg","查询成功!");
        }catch (Exception ex){
            result.put("datas",null);
            result.put("status","500");
            result.put("msg","查询失败,请联系管理员!");

            ex.printStackTrace();
        }

        return result;
    }

    @RequestMapping(value = "/user/insert")
    public Map<String,Object> insert(){
        //封装返回结果
        Map<String,Object> result=new HashMap<String, Object>();

        try {
            //创建一个user对象
            User user=new User();
            user.setUserName("zhangsan");
            user.setEmail("zs@163.com");
            user.setPhone("12345678901");
            user.setGender("男");
            user.setAge(25);
            user.setDesc("普通用户");

            //添加操作
            iUserService.insertUser(user);

            //返回结果
            result.put("datas",null);
            result.put("status","200");
            result.put("msg","添加成功!");
        }catch (Exception ex){
            result.put("datas",null);
            result.put("status","500");
            result.put("msg","添加失败,请联系管理员!");

            ex.printStackTrace();
        }

        return result;
    }
}
