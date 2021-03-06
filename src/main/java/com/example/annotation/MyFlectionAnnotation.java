package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyFlectionAnnotation {
    public static void main(String[] args) throws Exception {
        MyAnnotationUsage usage = new MyAnnotationUsage();
        //通过注解的方式来获取注解
        Class<?> classType = usage.getClass();
        Method method = classType.getDeclaredMethod("output",new Class[]{});
        if (method.isAnnotationPresent(MyAnnotation.class)){  //一定要设置成RUNTIME ：@Retention(RetentionPolicy.RUNTIME)，才能获取到该注解
            method.invoke(usage,new Object[]{});         //调用方法
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            //获取注解的值
            String hello = myAnnotation.hello();
            String world = myAnnotation.world();
            System.out.println(hello + " " + world);
            Annotation[] annotations = method.getDeclaredAnnotations();  //重要方法method.getDeclaredAnnotations()，获取注解数组
            for (Annotation annotation : annotations){
                System.out.println(annotation.annotationType().getName());
            }
        }
    }
}
