package com.example.reflect;

public class ClassTest {
    public static void main(String[] args) {
        Class<?> classType = Child.class;
        Class child = classType.getSuperclass();
        System.out.println(child);
    }
}

class Parent{

}

class Child extends Parent{

}