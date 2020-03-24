package com.example.innerclass.inner3;

public class LocalInner {
    public void doSomething(){
        class Inner3{
            public void test(){
                System.out.println("Local Inner3");
            }
        }
        new Inner3().test();
    }
}
