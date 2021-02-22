package com.liu.test;

import com.liu.Single.Singleton1;
import com.liu.Single.Singleton2;

public class Singleton {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.INSTANCE;
        System.out.println(s1);
        Singleton2 s2 = Singleton2.INSTANCE;
        System.out.println(s2);

    }
}
