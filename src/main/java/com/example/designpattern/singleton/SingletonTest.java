package com.example.designpattern.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton =  Singleton.getInstance();
        Singleton singleton2 =  Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode() == singleton2.hashCode());
        System.out.println("\n换行");

        SingletonOther other = SingletonOther.getInstance();
        SingletonOther other2 = SingletonOther.getInstance();
        System.out.println(other == other2);
        System.out.println(other.hashCode() +  "   " + other2.hashCode());

    }
}
