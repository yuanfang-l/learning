package com.liu.test;
interface Note{

    static void print1(){
        System.out.println("接口中的静态方法");
    }
    void print();

    default void dprint(){
        System.out.println("接口中的默认方法");
    }

}
 class Realize implements Note {

    @Override
    public void print() {
        System.out.println("实现类中的方法");
    }

}

public class test03 {
    public static void main(String[] args) {
        int index = 0;
        boolean flag = false;
        System.out.println((flag!=!flag? index--:index++)==index?flag:++index);



        Note n = new Realize();
        n.print();//会输出实现类的方法
        n.dprint();//会输出接口中的方法
        Note.print1();

    }
}
