package com.xp.springcloud.service;

import com.xp.springcloud.pojo.User;

import java.util.List;

public interface IUserService {

    void insertUser(User user);

    User getUserByName(String userName);

    List<User> getUsers();
}
