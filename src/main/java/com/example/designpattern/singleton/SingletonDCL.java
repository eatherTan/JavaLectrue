package com.example.designpattern.singleton;

/**
 * 双重检查模式 （DCL）
 */
public class SingletonDCL {
    private volatile static SingletonDCL singleton;

    public SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (singleton== null) {
            synchronized (Singleton.class) {
                if (singleton== null) {
                    singleton= new SingletonDCL();
                }
            }
        }
        return singleton;
    }
}
