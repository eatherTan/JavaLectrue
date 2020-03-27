package com.example.map;

import java.util.*;

public class MapCountWords {
    public static void main(String[] args) {
        /**
        * 统计随机数字出现的次数，以及出现次数最多的次数是多少？
        */
        TreeMap<Integer,Integer> map = new TreeMap();
        for (int i = 0; i < 50; i++) {
            int num = (int) (Math.random() * 40 + 10);
            //如果该值在map中没有出现，则出现次数为1
            if (map.get(new Integer(num)) == null) {
                map.put(new Integer(num), 1);
            } else {
                //如果该值在map中存在，则把出现次数+1
                map.put(num, ((Integer)map.get(num)).intValue()+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
        //计算最大的次数
        Collection collect =  map.values();
        Integer max = (Integer) Collections.max(collect);
        System.out.println("出现最多次数为：" + max);
    }
}




