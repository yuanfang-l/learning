package com.liu.dao;

import com.liu.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserLike(String value);


    List<User> getUserList();

    User getUserId(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
