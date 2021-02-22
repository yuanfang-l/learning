package com.liu.demo01;



//创建线程方式2 :实现runnable接口, 重写run方法，执行线程需 要丢\runnable接口实现类。调用start方法。


public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("进行run方法第"+i+"次");
        }

    }

    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
        new Thread(testThread3).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("进行main方法第"+i+"次");
        }
    }
}
