package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        String[] a = {"aa","bb","aa","hello","hello"};
    }

    /**
     * 统计每个单词出现的次数
     * @param a
     * @return
     */
    public static void countTimes(String[] a){
        Map<String,Object> map = new HashMap<>();
        for (int i = 0; i< a.length; i++){

            if (map.get(a[i]) == null){
                map.put(a[i],new Integer(1));
            }else {
                Integer count = (Integer) map.get(a[i]);
                map.put(a[i], new Integer(count.intValue() + 1));
            }
        }
    }
}
