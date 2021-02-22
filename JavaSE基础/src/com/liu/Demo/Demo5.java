package com.liu.Demo;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        //0、将发送到服务器的中文，进行url编码

        URL u1 = new URL("http://zaixianke.com/yq/all");
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
