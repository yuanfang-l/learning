package com.liu.Collection;

public class HashMap {
/*
v = map.get(k)实现原理∶
先调用k的hashCode0方法得出哈希值，通过哈希算法
转换成数组下标，通过数组下标快速定位到某个位置
上，如果这个位置上什么也没有，返回null。如果这个
位置上有单向链表，那么会拿着参数k和单向链表上的
每个节点中的k进行equals，如果所有equals方法返回
false，那么get方法返回null，只要其中有一个节点的k
和参数k equals的时候返回true，那么此时这个节点的
value就是我们要找的value , get方法最终返回这个要
找的value。

 */
                /* HashMap底层实际上就是一个数组。(一维数组）
                Node<K,v>[] table;
                 //静态的内部类HashMap.Node
                static class Node<K,V> {
                     final int hash; //哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法，可以转换成存储成数组的下标)
                     final K key;    //存储到Map集合中的那个Key
                     v value;        //存储到Map集合中的那个Value
                     Node<K,V> next; //下一个节点的内存地址

                     哈希表/散列表:一维数组，这个数组中每一个元素是一个单向链表。（数组和链表的结合体。)

                 */

    }


