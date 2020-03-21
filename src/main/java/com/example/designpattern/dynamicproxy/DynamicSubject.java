package com.example.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 该代理类的内部属性时Object类型，实际使用时，使用该类的构造方法传递一个对象
 * 此外该类还实现了invoke() 方法，该方法中的method.invoke() 其实就是要调用被代理对象的要执行的方法
 * 方法参数是object，表示该方法从属于object对象，通过动态代理类，我们可以在执行真是对象的
 * 方法前后可以加入一些额外的方法
 */
public class DynamicSubject implements InvocationHandler {

    private Object object;

    public DynamicSubject(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling:" + method);
        //等价于realSubject的request() 方法，如果这里不调用的话，不会调用Method 对象中的方法
        method.invoke(object, args);
        System.out.println("after calling:" + method);
        return null;
    }
}
