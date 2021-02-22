package com.liu.pojo;

import javax.annotation.Resource;

public class Person {
    @Resource(name = "cat111")
    private Cat cat;
    @Resource(name = "dog222")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
