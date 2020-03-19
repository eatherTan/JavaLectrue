package com.example.designpattern.proxy;

public class ProxySubject implements Subject {

    private RealSubject realSubject; //代理角色内部引用了真实角色

    //代理角色实现目标动作
    public void request() {

        this.preRequest(); //在真实角色操作之前所附加的操作
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request(); // 真实角色所完成的事情
        this.afterRequet(); //在真实角色操作之后附加的操作
    }
    //代理角色之前完成的动作
    private void preRequest(){
        System.out.println("pre request");
    }

    private void afterRequet(){
        System.out.println("after request");
    }
}
