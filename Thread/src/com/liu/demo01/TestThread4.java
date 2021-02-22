package com.liu.demo01;


//发现问题:多个线程操作同一个资源的情况下,线程不安全，数据紊乱。

public class TestThread4 implements Runnable{

    private int tickets = 10;
    @Override
    public void run() {
        while (true){
            if(tickets<=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickets--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();
        new Thread(ticket,"刘").start();
        new Thread(ticket,"张").start();
        new Thread(ticket,"李").start();
    }
}
