package com.example.designpattern.singleton;

public class SingletonOther {

    private static SingletonOther instance;

    //仅类自己能访问
    private SingletonOther(){}

    public static SingletonOther getInstance() {
        if (instance == null){
            return new SingletonOther();
        }
            return instance;
    }

}
