package com.example.designpattern.singleton;

//懒汉模式
public class SingletonOther {

    private static SingletonOther instance;

    //懒汉模式 - 线程安全
    //private static synchronized SingletonOther instance;
    //仅类自己能访问
    private SingletonOther(){}

    public static SingletonOther getInstance() {
        if (instance == null){
            return new SingletonOther();
        }
        return instance;
    }

}
