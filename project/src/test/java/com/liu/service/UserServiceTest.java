package com.liu.service;

import com.liu.pojo.User1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    ClassPathXmlApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    }

    @Test
    public void findUser() {
        UserService userService =  ac.getBean("userService",UserService.class);
        User1 user = userService.findUser("l");
        System.out.println(user);
    }
}