package com.example.innerclass.inner1;

public class StaticInner {

    private static int a = 4;

    public static class Inner1{
        public void test(){
            System.out.println("输出"+ a);
        }
    }
}
