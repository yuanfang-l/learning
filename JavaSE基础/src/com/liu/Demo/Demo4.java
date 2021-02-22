package com.liu.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.Scanner;

/**
 * 进行短信发送
 *
 */
public class Demo4 {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户手机号");
        String s = input.nextLine();

        Random r = new Random();
        //1、（准备网址），创建一个URL的对象
        URL u1 = new URL("https://itdage.com/kkb/kkbsms?key=kkb&number="+s+"&code="+(r.nextInt(900000)+100000));
        //2、（建立连接），通过网址u1,打开网络连接，并得到连接对象conn
        URLConnection conn = u1.openConnection();
        //3、(获取数据传输的流),通过连接对象conn，获取输入流is
        InputStream is = conn.getInputStream();
        //4、将输入流is，装饰为一次能读取一行的  缓冲字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        //5、读取内容
        String text1 = br.readLine();
        System.out.println(text1);
        //6、关闭流
        br.close();

    }

}

