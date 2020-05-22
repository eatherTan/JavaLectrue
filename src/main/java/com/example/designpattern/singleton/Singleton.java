package com.example.designpattern.singleton;

//饿汉模式
public class Singleton {

    private static Singleton instance = new Singleton();

    //仅类自己能访问
    private Singleton(){}

    public static Singleton getInstance() {
            return instance;
    }

}
