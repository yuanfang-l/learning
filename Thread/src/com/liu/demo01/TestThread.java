package com.liu.demo01;




//创建线程方式- -: 继承Thread类，重写run()方法 ，调用start开启线程
//总结:注意,线程开启不一-定立即执行，由CPU 调度执行
public class TestThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("进行run方法第"+i+"次");
        }

    }

    public static void main(String[] args) {

        TestThread t1 = new TestThread();

        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("进行main方法第"+i+"次");
        }
    }
}
