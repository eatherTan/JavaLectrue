package com.example.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Private2Test {
    public static void main(String[] args) throws Exception {
        Private2 p2 = new Private2();

        Class<?> classType = p2.getClass();
        Field field = classType.getDeclaredField("name");
        field.setAccessible(true);
//        field.setAccessible(true);
        field.set(p2,"lisi");
        Method method = classType.getMethod("getName",new Class[]{});
        String modifyName = (String) method.invoke(p2,new Object[]{});
        System.out.println(modifyName);
    }
}
