package com.example.string;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.insert(0,"lala");
        System.out.println(buffer);
        int b = 8;
        int a = b--;
        int c = ++a;
        System.out.println(c);
    }
}
