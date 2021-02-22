package com.liu.Collection;
/*
自定义类型放入TreeSet/TreeMap中
1.实现Comparable接口。重写compaerTo方法
 */
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        Customer c1 = new Customer(10);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(100);
        TreeSet<Customer> ts = new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        for (Customer c :
                ts) {
            System.out.println(c);
        }
    }
}
//放在TreeSet集合中的元秦需要实现java.Lang. Comparable接口。
//并且实现compareTo方法。equals可以不写。

class Customer implements Comparable<Customer>{
    int age;
    public Customer(int age){
        this.age = age;
    }
//需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较!
// k.compareTo(t.key)
//拿着参数k和集合中的每一个k进行比较，返回值可能是>0<0 =0

    @Override
    public int compareTo(Customer o) {
        return o.age - this.age;
    }

    @Override
    public String toString() {
        return "Customer[age"+age+"]";
    }
}