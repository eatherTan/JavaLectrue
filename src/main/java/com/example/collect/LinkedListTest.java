package com.example.collect;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("B");
        link.add("C");
        link.add("D");
        link.add(1);
        System.out.println(link);
        System.out.println("---------------");
        link.remove("B");
        System.out.println(link);
        link.get(2);
        link.set(2,"t");

        System.out.println(link);
    }
}
