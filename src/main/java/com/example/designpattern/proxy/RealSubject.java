package com.example.designpattern.proxy;

public class RealSubject implements Subject {
    //真是角色实现了
    public void request() {
        System.out.println("From real subject");
    }
}
