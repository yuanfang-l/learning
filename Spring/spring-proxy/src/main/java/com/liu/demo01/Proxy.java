package com.liu.demo01;

public class Proxy implements Rent{
    private Host host;
    public Proxy() {

    }
    public Proxy(Host host) {
        this.host = host;
    }
    public void lookHouse(){
        System.out.println("带你看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void rent(){
        host.rent();
        lookHouse();
        fare();
    }

}
