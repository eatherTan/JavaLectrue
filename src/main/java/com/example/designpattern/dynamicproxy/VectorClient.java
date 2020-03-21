package com.example.designpattern.dynamicproxy;

import java.util.List;
import java.util.Vector;

public class VectorClient {
    public static void main(String[] args) {
        VectorProxy proxy = new VectorProxy();
        //动态生成出来的实例class com.sun.proxy.$Proxy0
        List<String> list = (List<String>) proxy.factory(new Vector<>());
        System.out.println(list.getClass());
        list.add("tan");
        list.remove(0);
    }
}
