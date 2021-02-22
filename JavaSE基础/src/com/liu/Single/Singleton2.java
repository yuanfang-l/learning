package com.liu.Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum Singleton2 {
    INSTANCE;

    public static Singleton2 getInstance(){
        return INSTANCE;
    }

}
class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton2 instance = Singleton2.INSTANCE;
        Constructor<Singleton2> declaredConstructor = Singleton2.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        Singleton2 instance2 = declaredConstructor.newInstance();
        System.out.println(instance);

    }
}
