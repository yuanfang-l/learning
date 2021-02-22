package com.liu.Collection;


/*
        1、TreeSet集合底层实际上是一个TreeMap
        2、TreeMap集合底层是一个二叉树。
        3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了。
        4、TreeSet集合中的元素:无序不可重复，但是可以按照元素的大小顺序自动排序。称为：可排序集合；
        5、对自定义的类型来说，TreeSet可以排序吗?
            以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
            谁大谁小并没有说明。
            以下程序运行的时候出现了这个异常:
            java.lang.ClassCastException: com.liu.Collection.person
            cannot be cast to java.lang.Comparable
            出现这个异常的原因是:
                Person类没有实现java.Lang.Comparable接口。


 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetdemo01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("liu");
        ts.add("yi");
        ts.add("xing");

        for (String s : ts) {
            System.out.println(s);
        }


        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(10);
        ts2.add(100);
        ts2.add(50);
        for (Integer s :
                ts2) {

            //升序排列
            System.out.println(s);
        }

        person p1 = new person(15);
        person p2 = new person(50);
        person p3 = new person(100);
        Set<person> p = new TreeSet<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        for (person n :
                p) {
            System.out.println(n);
        }
    }
}

class person{
    public int age;
     person(int age){
        this.age = age;
    }

}
