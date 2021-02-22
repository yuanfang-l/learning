package com.liu.demo01;

import lombok.var;
import sun.security.krb5.internal.Ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo01 {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2();
        Ticket2 ticket2 = new Ticket2();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket2.sale();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale(); },"A").start();
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale(); },"B").start();
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale(); },"C").start();

        
    }
}


class Ticket2{
    private static int number = 30;
    static Lock lock = new ReentrantLock();

    public static void sale(){

        lock.lock();

        try {
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"卖出第"+(number--)+"张票，剩余:"+number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
