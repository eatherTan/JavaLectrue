package com.example.annotation;

public class OverrideTest {
    //重写注解
    @Override
    public String toString() {
        return "this is OverrideTest" ;
    }
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.toString();
    }
}
