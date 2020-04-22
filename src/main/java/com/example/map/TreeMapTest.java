package com.example.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap<String,Person> map = new TreeMap();
        Person p1 = new Person(12);
        Person p2 = new Person(13);
        Person p3 = new Person(16);
        Person p4 = new Person(2);
        map.put("b",p1);
        map.put("a",p2);
        map.put("c",p3);
        map.put("d",p4);
//        System.out.println();
        for (Map.Entry<String,Person> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue().age);
        }
        Set collection = map.entrySet();
        System.out.println(map.entrySet());

    }

}
