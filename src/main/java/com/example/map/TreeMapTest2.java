package com.example.map;

import java.util.*;

public class TreeMapTest2 {

    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap();
        map.put("b","bb");
        map.put("a","aa");
        map.put("c","cc");
        map.put("d","dd");
        map.put("d","ee");

        Set set = map.entrySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext();){
            Map.Entry key = (Map.Entry) iterator.next();
            System.out.println(key);
        }
    }
}
