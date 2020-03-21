package com.example.reflect;

import java.lang.reflect.Method;

public class DumpMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        //获得String的Class 对象
        Class<?> classType = Class.forName("java.lang.Integer");

        Method[] methods = classType.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method);
        }
    }
}
