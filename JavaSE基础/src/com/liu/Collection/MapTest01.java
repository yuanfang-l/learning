package com.liu.Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
java. util.Map接口中常用的方法:
1、Map 和ollection没有继承关系。
2、Map集合以key积value的方式存储数据:键值对
key和value都是引用数据类型。
key,和value都是存储对象的内存地址。
key起到主导的地位, value.是key的一个附属品。
3、Map 接口中常用方法:

V put(K key, V value) 向Map集合中添加键值对
V get(Object key)通过key获取value
void clear()清空Map集合
boolean containsKey(object key) 判断Map中是否包含某个key
boolean containsValue(object value) 判断Map中是否包含某个value
boolean isEmpty ( )判断Map 集合中元素个数是否为0
Set<K> keySet() 获取Map集合所有的key(所有的键是一个set集合)
V remove(Object key)通过key删除键值对
int size() 获取Map集合中键值对的个数。
Collection<V> values() 获取Map集合中所有的value ,返回一个Collection .
Set<Map. Entry<K, V>> entrySet()
糊Map集合转换成set集合
假设现在有- -个Map集合,如下所示:
map1集合对象
key                 value
1                 zhangsan
2                 lisi
3                 wangwu
4                 zhaoliu
Set set = map1. entrySet(); .
set集合对象
1 = zhangsan [注 意: Map集合通过entrySet()方法转换成的这个Set集合, Set集合中元素的类型是Map. Entry<K, V>]
2 = lisi        [Map. Entry和String一样，都是-种类型的名字，只不过: Map. Entry是静态内部类,是Map中的静态内部类]
3 = wangwu
4 = zhaoliu

 */
public class MapTest01 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"liu");
        map.put(2,"yi");
        map.put(3,"xing");

        Set<Integer> keys = map.keySet();

                   //第一种方式，效率较低，数据量小时可以使用
/* 1.       Iterator<Integer> it1 = keys.iterator();
        while (it1.hasNext()){
            Integer key = it1.next();
            String value = map.get(key);
            System.out.println(key+"="+value);


     2.   for (Integer key : keys){
            System.out.println(key+ "="+map.get(key));

        }
 */
        //第二种方式  效率高于第一种，适合大量数据
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            System.out.println(node.getKey()+ "=" +node.getValue());
        }

        for (Map.Entry node : set){
            System.out.println(node.getKey()+" ====> "+node.getValue());
        }

    }



}
