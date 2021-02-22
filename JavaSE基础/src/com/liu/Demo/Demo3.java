package com.liu.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

/**
 * 与图灵机器人聊天
 *
 */
public class Demo3 {

    public static void main(String[] args) throws IOException {
        //0、将发送到服务器的中文，进行url编码
        String content = URLEncoder.encode("天津天气怎么样", "utf-8");
        //1、（准备网址），创建一个URL的对象
        String uText = "https://api.jisuapi.com/iqa/query?question="+content+"&appkey=62958a3a6ef3c56d";
        System.out.println(uText);
        URL u1 = new URL(uText);
        //2、（建立连接），通过网址u1,打开网络连接，并得到连接对象conn
        HttpsURLConnection conn = (HttpsURLConnection) u1.openConnection();
        conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.163 Safari/535.1");
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
