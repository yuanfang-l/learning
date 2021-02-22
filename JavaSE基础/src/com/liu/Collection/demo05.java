package com.liu.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo05 {
    public static void main(String[] args) {
        List mylist =  new ArrayList();
        mylist.add("A");
        //默认都是向集合末尾添加元素。

        mylist.add("B");
        mylist.add("C");
        mylist.add("D");
        mylist.add("D");

        //在列表的指定位置插入指定元素(第一个参数是下标)
        //这个方法使用不多.因为对FArrayL ist集合来说效率比较低。
        mylist.add(2,"LIU");
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        //根据下标获取元素
        Object o = mylist.get(2);
        System.out.println(o);

        //List特殊遍历方式
        for (int i = 0; i < mylist.size(); i++) {
            Object o1 = mylist.get(i);
            System.out.println(o1);
        }

        // 获取指定对象第一次出现处的索引。
        System.out.println(mylist.indexOf("LIU"));
        //获取指定对象最后一次出现处的索引。
        System.out.println(mylist.lastIndexOf("D"));

        //删除指定下标位置的元素
        mylist.remove(4);
        System.out.println(mylist.size());
        System.out.println("================================");

        //修改指定位置的元素
        mylist.set(3,"YI");

        for (int i = 0; i < mylist.size(); i++) {
            Object o1 = mylist.get(i);
            System.out.println(o1);
        }

    }
}
