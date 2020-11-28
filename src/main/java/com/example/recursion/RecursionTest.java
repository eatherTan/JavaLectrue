package com.example.recursion;

public class RecursionTest {
    public static void main(String[] args) {

    }
    public void test(int n){
        if (n > 2){
            test(n-1);
        }
        System.out.println("n = " );
    }
}
