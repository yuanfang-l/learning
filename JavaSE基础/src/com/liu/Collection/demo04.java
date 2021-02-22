package com.liu.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo04 {
    public static void main(String[] args) {
        Collection o = new ArrayList();
        String s1 = new String("liu");
        o.add(s1);
        String s2= new String("liu");
        o.remove(s1);
        System.out.println(o.size());
    }
}
