package com.example.reflect;

import java.lang.reflect.Method;

public class PrivateTest {
    public static void main(String[] args) throws Exception {
        Private p = new Private();

        Class<?> classType =  p.getClass();
        Object obj = classType.newInstance();
        Method method = classType.getDeclaredMethod("sayHello", String.class);
        method.setAccessible(true); //压制Java的访问控制检查
        String str = (String) method.invoke(obj,new Object[]{"zhangsan"});
        System.out.println(str);
    }
}
