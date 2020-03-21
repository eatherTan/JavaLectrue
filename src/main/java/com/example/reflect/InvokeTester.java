package com.example.reflect;

import java.lang.reflect.Method;

public class InvokeTester {
    public int add(int param1, int param2){
        return param1 + param2;
    }

    public String echo(String message){
        return "hello: " + message;
    }

    public static void main(String[] args) throws Exception {
        //获取Class对象
        //Class<?> classType = Class.forName("reflect.InvokeTester");
        Class<?> classType = InvokeTester.class;
        //实例化对象
        Object invokeTester = classType.newInstance();
        //System.out.println(invokeTester instanceof InvokeTester);
        //获得方法对象
        Method addMethod = classType.getMethod("add", new Class[]{int.class, int.class});
        //方法调用invoke(要调用方法的对象，参数)
        Object result = addMethod.invoke(invokeTester,new Object[]{1,2});
        System.out.println((Integer)result);

        System.out.println("----------------------");
        Method echoMehtod = classType.getMethod("echo", new Class[]{String.class});
        Object result2 = echoMehtod.invoke(invokeTester,new Object[]{"tanxiaolian"});
        System.out.println((String)result2);
    }
}
