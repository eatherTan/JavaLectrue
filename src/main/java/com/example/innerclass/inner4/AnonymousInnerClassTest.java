package com.example.innerclass.inner4;

import java.util.Date;

@SuppressWarnings("deprecation")
public class AnonymousInnerClassTest {
    public String getDate(Date date){
        return date.toLocaleString();
    }

    public static void main(String[] args) {
        AnonymousInnerClassTest test = new AnonymousInnerClassTest();
        //匿名内部类：继承了Date 类的子类作为参数传递了过去
        String str = test.getDate(new Date(){
            public String toLocaleString(){
                return "hello world";
            }
        });
        System.out.println(new Date(){});
        System.out.println(str);
    }
}
