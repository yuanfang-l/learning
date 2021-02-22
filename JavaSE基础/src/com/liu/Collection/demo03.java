package com.liu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class demo03 {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        a.add(111);
        a.add(333);
        a.add(222);

        Iterator it1 = a.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }


        Collection c2 = new HashSet();
        c2.add(101);
        c2.add(103);
        c2.add(147);
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object n2 = it2.next();
            System.out.println(n2);
        }

    }



}
