package com.liu.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

java.util.collection集合接口
java.util.Collections集合工具类，方便集合的操作。

 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        Collections.synchronizedList(a);

        a.add("liu");
        a.add("xing");
        a.add("yi");

        Collections.sort(a);
        for (String s :
                a) {
            System.out.println(s);
        }
    }
}
