package com.example.base;

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = null;
        //比较两个字符串是否相等
        if (str1 != null){
            boolean isEqual = "hello".equals(str1);
            System.out.println(isEqual);
        }
    }
}
