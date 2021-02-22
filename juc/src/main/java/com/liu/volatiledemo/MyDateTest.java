package com.liu.volatiledemo;

import java.util.concurrent.atomic.AtomicInteger;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    myDate.ADDSUM();
                    myDate.ADDATOMIC();

                }
            },String.valueOf(i)).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally num vallue"+ myDate.num);
        System.out.println(Thread.currentThread().getName()+"\t finally num vallue"+ myDate.atomicInteger);
    }

}
class MyDate{
    volatile int num = 0;
    public  void ADDSUM(){
        num++;
    }
    AtomicInteger atomicInteger = new AtomicInteger();
    public void ADDATOMIC(){
        atomicInteger.getAndIncrement();
    }
}
