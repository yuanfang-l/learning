package com.liu.service.impl;

import com.liu.mapper.UserMapper;
import com.liu.pojo.User1;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public User1 findUser(String name){
       return userMapper.findUser(name);
    }
}
