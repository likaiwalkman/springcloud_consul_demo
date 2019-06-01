package com.xp.springcloud.mapper;

import com.xp.springcloud.pojo.User;

import java.util.List;

/**
 * mapper接口
 */
public interface UserMapper {

    void insertUser(User user);

    User getUserByName(String userName);

    List<User> getUsers();
}
