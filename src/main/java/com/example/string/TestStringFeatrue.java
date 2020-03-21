package com.example.string;

public class TestStringFeatrue {

    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
    }
}
