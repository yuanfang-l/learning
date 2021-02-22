package com.liu.service;

import com.liu.dao.UserMapper;
import com.liu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserMapper userMapper;

    public User queryUserByUserName(String name) {

        return userMapper.queryUserByUserName(name);
    }
}
