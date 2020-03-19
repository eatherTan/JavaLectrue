package com.example.annotation;

import java.util.Date;

public class DeprecatedTest {
    @Deprecated
    public void doSomething(){
        System.out.println("do something");
    }
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toLocaleString());
        DeprecatedTest test = new DeprecatedTest();
        test.doSomething();
    }
}
