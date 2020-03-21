package com.example.designpattern.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    //仅类自己能访问
    private Singleton(){}

    public static Singleton getInstance() {
            return instance;
    }

}
