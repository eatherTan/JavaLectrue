package com.example.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEachLamdaTest {
    public static void main(String[] args) {
        // 创建一个集合
        Collection objs = new HashSet();
        objs.add("C语言中文网Java教程");
        objs.add("C语言中文网C语言教程");
        objs.add("C语言中文网C++教程");
        // 获取objs集合对应的迭代器
        Iterator it = objs.iterator();
        // 使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
        it.forEachRemaining(obj -> obj.equals(obj));

        ArrayList<String> list = new ArrayList<>();
        list.add("tan");
        list.add("xiao");
        list.add("lian");
        Iterator iterator = list.iterator();
        //使用lamda表达式，来遍历集合
        iterator.forEachRemaining(l -> {l.toString(); });
    }
}
