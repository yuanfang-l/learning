package com.liu.demo02;

public class UserServiceImpl implements UserService{
    private UserService userService;

    public void add() {
        System.out.println("增加了一个对象");
    }

    public void delete() {
        System.out.println("删除了一个对象");
    }

    public void update() {
        System.out.println("修改了一个对象");
    }

    public void query() {
        System.out.println("查询了一个对象");
    }
}
