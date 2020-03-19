package com.example.base;

public class ReferenceTest {

    //引用类型方法传递
    int a = 4;

    public int  editVariable(int b){
        b = 5;
        System.out.println("输出变量b "  + b);
        return b;
    }

    public static void main(String[] args) {
        ReferenceTest re = new ReferenceTest();

        re.a = 2;
        System.out.println("修改类的成员变量 ：" +re.a);

        int a = 1;
        re.editVariable( a);
        System.out.println("输出变量a " + a);
        System.out.println(re.editVariable(a));

    }
}
