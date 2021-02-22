package com.liu.test;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//配置信息
//useUnicode=true&characterEncoding=utf-8解决中文乱码
        String ur1="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "123456";
//1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接数据库,代表数据库
        Connection connection = DriverManager.getConnection(ur1,username, password);

        //3.向数据库发送对象Statement：CRUD

        Statement statement = connection.createStatement();

        //4.编写SQL
        String sql = "Select * from users";

        //5.执行SQL
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            System.out.println("id"+rs.getObject("id"));
            System.out.println("name"+rs.getObject("name"));
            System.out.println("password"+rs.getObject("password"));
            System.out.println("email"+rs.getObject("email"));
            System.out.println("birthday"+rs.getObject("birthday"));
        }
        //6.关闭连接，释放资源，先开的后关
        rs.close();
        statement.close();
        connection.close();
    }

}
