package com.liu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("liu");
        c.add("yi");
        c.add("xing");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
