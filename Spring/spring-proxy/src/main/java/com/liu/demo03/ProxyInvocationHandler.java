package com.liu.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        lookHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }
    public void lookHouse(){
        System.out.println("带你看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
