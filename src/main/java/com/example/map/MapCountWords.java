package com.example.map;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapCountWords {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> map = new TreeMap();
        for (int i = 0; i < 50; i++) {
            int num = (int) (Math.random() * 40 + 10);
            if (map.get(new Integer(num)) == null) {
                map.put(new Integer(num), 1);
            } else {
                map.put(num, ((Integer)map.get(num)).intValue()+1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }

        Collection collect =  map.values();
        Integer max = (Integer) Collections.max(collect);
        System.out.println("最大的信息" + max);
    }
}




