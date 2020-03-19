package com.example.annotation;

public class OverrideTest {
    @Override
    public String toString() {
        return "this is OverrideTest" ;
    }
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.toString();
    }
}
