package com.example.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VectorProxy implements InvocationHandler {

    private Object object;

    public VectorProxy(){
    }
    public VectorProxy(Object object){
        this.object = object;
    }

    public Object factory(Object object){
        Class<?> classType = object.getClass();
        Object obj = Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(),new VectorProxy(object));
        return obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (null != args){
            for (Object o : args) {
                System.out.println(args);
            }
        }
        System.out.println("before calling :" + method);
        Object object1 = method.invoke(object, args);
        System.out.println("after calling :" + method);
        return object1;
    }
}
