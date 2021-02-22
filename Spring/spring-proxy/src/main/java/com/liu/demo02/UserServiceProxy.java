package com.liu.demo02;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        System.out.println("增加了一个对象");
    }

    public void delete() {
        log("delete");
        System.out.println("删除了一个对象");
    }

    public void update() {
        log("update");
        System.out.println("修改了一个对象");
    }

    public void query() {
        log("query");
        System.out.println("查询了一个对象");
    }
    public void log(String msg){
        System.out.println("[debug] 使用了"+msg+"方法");
    }
}
