package com.liu.Collection;

import java.util.Hashtable;
import java.util.Properties;

/*
目前只需要掌握Properties属性类对象的相关方法即可。
Properties是一个Map集合，继承Hashtable ,Properties的ley和value都是string类型。
Properties被称为属性类对象。
Properties是线程安全的。
 */
public class PropertiseDemo01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("url","jdbc:mysql://localhost:3306/mybatis?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8");
        pro.setProperty("usename","root");
        pro.setProperty("password","123456");
        pro.setProperty("driver","com.mysq1.jdbc.Driver");


        String url =  pro.getProperty("url");
        String usename =  pro.getProperty("usename");
        String driver =   pro.getProperty("driver");
        String password =  pro.getProperty("password");

        System.out.println(url);
        System.out.println(usename);
        System.out.println(driver);
        System.out.println(password);
    }

}
