package com.example.designpattern.dynamicproxy;

public class RealSubject implements Subject {
    @Override
    public void request(String str) {
        System.out.println("From Real Subject!" + "  args:" + str );
    }
}
