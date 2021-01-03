package com.example.map;

import java.util.HashMap;

/**
 * 用打断点的方式
 * 深度了解HashMap的底层原理
 * 打断点：用Force step in 进入底层调用方法
 */
public class HashMapOfDeep {
    public static void main(String[] args) {
        System.out.println("★★★★★★解剖开始★★★★★★");
        HashMap<String, String> map = new HashMap<>(12);
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        // 实验key相同的情况
        map.put("4", "D");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
        map.put("11", "11");
        map.put("12", "12");
        // 第一个扩容点
        map.put("13", "13");
        map.put("14", "14");
        map.put("15", "15");
        map.put("16", "16");
        map.put("17", "17");
        map.put("18", "18");
        map.put("19", "19");
        map.put("20", "20");
        map.put("21", "21");
        map.put("22", "22");
        map.put("23", "23");
        map.put("24", "24");
        //第二个扩容点
        map.put("25", "25");
    }
}
