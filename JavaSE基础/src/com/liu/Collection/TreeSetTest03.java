package com.liu.Collection;

import java.util.Comparator;
import java.util.TreeSet;

/*

TreeSet集合中元素可排序的第二种方式:使用比较器的方式。
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
/*        创建TreeSet集合的时候，需要使用这个比较器。
        TreeSet<WuGui>wuGuis = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器进去。
第一种匿名内部类方式
        TreeSet<Anmial> ts = new TreeSet<>(new Comparator<Anmial>() {
            @Override
            public int compare(Anmial o1, Anmial o2) {
                return o1.age - o2.age;
            }
        });

 */

        //第二种  单独在这里编写一个比较器
        TreeSet<Anmial> ts = new TreeSet<>(new AnmialComparator());
        ts.add(new Anmial(500));
        ts.add(new Anmial(1000));
        ts.add(new Anmial(2300));
        for (Anmial t :
                ts) {
            System.out.println(t);
        }

    }
}
class Anmial {
    int age;

    public Anmial(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "动物{" +
                "age=" + age +
                '}';
    }
}


//比较器实现java.util.Comparator接口。(Comparable是java.Lang包下的。Comparator是java.util包下的。)

class AnmialComparator implements Comparator<Anmial>{
    @Override
    public int compare(Anmial o1, Anmial o2) {
        return o1.age - o2.age;
    }
}

