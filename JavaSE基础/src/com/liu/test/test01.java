package com.liu.test;

public class test01 {
    public static void main(String[] args) {
        int a = 123;
        int b = 123;
        System.out.println(a==b);

        String c = "123";
        String d = "123";

        String e = new String("123");
        String f = new String("123");
        System.out.println(c==d);
        System.out.println(e==f);
        //System.out.println(a==c);
        System.out.println(e==c);
    }


}
