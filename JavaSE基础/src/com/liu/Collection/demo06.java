package com.liu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/*

1、默认初始值为10,数组长度为10(底层先创建了-个长度为0的数组，当添加第-个元素的时候，初始化容量10。)

2、ArrayList集合的扩容:
    增长到原容量的1.5倍。
    ArrayList.集合底层是数组,怎么优化?
     尽可能少的扩容。因为数组扩容效罕比较低,建议在使用Arraylist集合的时候预估计元素的个数,给定一个初始化容量。

3、数组优点:
         检索效宰比较高(每个元素占用空间大小相同,内存地址是连续的，知道首元素内存地址,
         然后知道下标,通过数学表达式计算出元素的内存地址，所以检索效率最高。)
4、数组缺点:
           随机增删元素效率比较低。
           另外数組无法存储大数据量。( 很难找到-块非常巨大的连续的内存空间。)

5、向数组末尾添加元素,效率很高,不受影响。

6、面试官经常问的一个问题?
          这么多的集合中，你用哪个集合最多?
           答: ArrayList集合。
           因为往数組末尾添加元素,效率不受影响：另外，我们检索/查找某个元素的操作比较多。

7、ArrayList集合是非线程安全的。( 不是线程安全的集合)

 */
public class demo06 {
    public static void main(String[] args) {
        //默认初始值为10,数组长度为10
        List list = new ArrayList();

        //指定初始值20，数组长度为20
        List list2 = new ArrayList(20);

        Collection c = new HashSet();
        c.add(111);
        c.add(222);
        c.add(333);


        //通过这个构造方法就可以将HashSet集合转换成L ist集合。
        List mylist = new ArrayList(c);
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
     }
}
