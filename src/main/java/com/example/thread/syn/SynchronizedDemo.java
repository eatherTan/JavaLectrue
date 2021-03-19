package com.example.thread.syn;

/**
 * 了解Syncronized的实现原理,要反编译的，但是反编译没有成功
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class){

        }
        method();
    }

    private static void method(){

    }
}
