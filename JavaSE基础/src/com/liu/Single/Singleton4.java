package com.liu.Single;

public class Singleton4 {

    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        return InnerClass.INSTANCE;
    }
    public static class InnerClass{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
}
