package com.xp.springcloud.service.impl;

import com.xp.springcloud.mapper.UserMapper;
import com.xp.springcloud.pojo.User;
import com.xp.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    //自动注入mapper
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
