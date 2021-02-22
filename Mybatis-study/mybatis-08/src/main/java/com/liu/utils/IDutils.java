package com.liu.utils;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDutils {

    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-",".");
    }

    @Test
    public void addInitBlog(){
       System.out.println(IDutils.getID());
        System.out.println(IDutils.getID());
        System.out.println(IDutils.getID());
    }
}
