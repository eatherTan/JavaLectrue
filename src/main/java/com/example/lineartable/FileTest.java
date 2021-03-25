package com.example.lineartable;

public class FileTest {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println("第0次" + Integer.toBinaryString(n));

//        int n = cap - 1;
        int  m = n >>> 1;
        System.out.println("第1次移位" + Integer.toBinaryString(m));

        n  = m | n ;
        System.out.println("第2次 或" + Integer.toBinaryString(n));
        System.out.println("第2次 或" + n);


        n |= n >>> 2;
        System.out.println(Integer.toBinaryString(n));

        n |= n >>> 4;
        System.out.println(Integer.toBinaryString(n));

        n |= n >>> 8;
        System.out.println(Integer.toBinaryString(n));

        n |= n >>> 16;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n);
    }
}
