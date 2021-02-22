package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.要获取下载文件的路径
        String realPath = "D:\\down\\IdeaProjicts\\untitled\\response\\target\\response\\WEB-INF\\classes\\刘.png";
        System.out.println("要获取下载文件的路径"+realPath);
        // 2.要获取下载文件的文件名
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        // 3.设置浏览器支持下载
        resp.setHeader("Content-Disposition", "attachment; filename="+ URLEncoder.encode("刘.png","UTF-8"));
        //4.获取下载文件输入流
        FileInputStream in  = new FileInputStream(realPath);
        //5.创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1048576];
        //6.获取输出流OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
        //7.将FileOutputStream流写入到buffer缓冲区,使用OutputStream将缓冲区数据输出到客户端
        while ((len=in.read(buffer))>0) {
            out.write(buffer,0,len);
        //8关闭流
            in.close();
            out.close();
        }



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
