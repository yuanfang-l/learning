package com.liu.test;

import java.lang.ref.SoftReference;

public class test04 {

    public static void main(String[] args) {
        String str = "i am a boy";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("--------------------");

        String s = new String(chars);
        String s1 = String.valueOf(chars);
        System.out.println("S:" + s);
        System.out.println("s1:" + s1);

        System.out.println("----------------------");

        byte[] bytes = str.getBytes();
//        System.out.println(bytes.toString());
        for(byte b :bytes){
            System.out.println(b);
        }
        System.out.println("---------------------------");
        char a = '6';
        int b = a - '0';
        System.out.println(b);

        System.out.println("---------------------");

        String str2 = "^e&(_((w(*_**_*(";
        String[] s2 = str2.split("\\w");
        for(String s3: s2){
            System.out.println(s3);
        }

        System.out.println(str.replace('a', 'j'));


        System.out.println("======================");

        String str1 = "abc";
        String str3 = "acc";
        System.out.println(str1.compareTo(str3));
    }
}
