package com.liu.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {


        Collection c = new ArrayList();
        c.add("liu");
        c.clear();
        c.add("yi");
        c.add("xing");
        boolean contains = c.contains("yi");
        boolean contains2 = c.contains("liu");
        System.out.println(contains);
        System.out.println(contains2);
        System.out.println(c);
        c.remove("yi");
        c.add("liu");
        boolean empty = c.isEmpty();
        System.out.println(empty);
        Object[] objects = c.toArray();
        for (int i=0;i<objects.length;i++){
            Object o = objects[i];
            System.out.println(o.toString());
        }


    }
}
