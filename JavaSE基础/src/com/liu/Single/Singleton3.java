package com.liu.Single;


public class Singleton3 {

    public volatile static Singleton3 INSTANCE;

    private Singleton3(){
        System.out.println(Thread.currentThread().getName()+"ok");

    }
    //双重检测锁模式的懒汉单例 DCL懒汉式
    public static Singleton3 getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton3.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton3();
                }

            }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                Singleton3.getInstance();
            }).start();
        }
    }
}

