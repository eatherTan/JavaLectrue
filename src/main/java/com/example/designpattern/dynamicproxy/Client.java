package com.example.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicSubject(realSubject);
        Class<?> classType = handler.getClass();
        //下面的代码一次性生成代理
        // 动态生成了class com.sun.proxy.$Proxy0  的实例，
        Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(),handler);
        subject.request("tanxiaolian");
        System.out.println(subject.getClass());

    }
}
