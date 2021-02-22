package com.liu.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        URL u1 = new URL("http://www.baidu.com/");
        URLConnection conn = u1.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String t1 = br.readLine();
        String t2 = br.readLine();
        String t3 = br.readLine();
        String t4 = br.readLine();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        String t5 = br.readLine();
        String t6 = br.readLine();
        System.out.println(t5);
        System.out.println(t6);

        br.close();


    }


}
