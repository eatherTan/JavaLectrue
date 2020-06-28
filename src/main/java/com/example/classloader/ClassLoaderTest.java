package com.example.classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String");
            System.out.println(clazz.getClassLoader());//根类加载器

            Class classSingle = Class.forName("com.example.classloader.SingleTon");
            System.out.println(classSingle.getClassLoader());//系统加载器
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
