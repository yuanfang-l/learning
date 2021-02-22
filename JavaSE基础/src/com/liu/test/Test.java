package com.liu.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        ArrayList list = new ArrayList(30);

        LinkedList<Object> objects = new LinkedList<>();
        objects.add(12);
        objects.add(123);
        objects.add(1234);

        for (int i = 0; i <3 ; i++) {
            System.out.println(objects.get(i));

        }
        Outer outer = new Outer();
        outer.test();

//        ？ extends Student <= Student;
        List<? extends Student> list1 = new ArrayList<>();
        //? super Person >= Person
        List<? super Person> list2 = new ArrayList<>();

//        List<Person> list;

        List<Person> arrayList2 = new ArrayList<>();

//        list = arrayList2;

        ArrayList<Person> arrayList = new ArrayList<>();
        ArrayList<Object> arrayList1 = new ArrayList<>();
        list2.add(new Person());
        list2.add(new Student());
        Object object = list2.get(0);

        list2 = arrayList1;
        list2 = arrayList;

        list1.add(null);
//        list1.add(new Person());
//        list1.add(new Student());
        Student student = list1.get(0);

    }
}
class Outer {

    private String outerName = "This is Outer Name";

    public void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println(inner.a);
    }
    


    public class Inner {
        private int a = 111;

        public void display() {
            System.out.println(outerName);
        }
    }
}


class Person{

}

class Student extends Person{

}
