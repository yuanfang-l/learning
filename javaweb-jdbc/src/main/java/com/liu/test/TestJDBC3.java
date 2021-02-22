package com.liu.test;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC3 {

    @Test
    public void test()  {
        //配置信息
        //useUnicode=true&characterEncoding=utf-8 解决中文乱码
        String url="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "123456";

        Connection connection = null;
        //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2.连接数据库,代表数据库
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);

            String sql="update account set money=money-100 where name = 'A';";
            connection.prepareStatement(sql).execute();

            int i;
            //i=1/0;
            String sql2="update account set money=money+100 where name = 'B';";
            connection.prepareStatement(sql2).execute();


            connection.commit();
            System.out.println("success");
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
