package com.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        map.put("d","dd");

        Set set = map.entrySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext();){
            Map.Entry obj = (Map.Entry) iterator.next();
            System.out.println(obj.getKey());
            System.out.println(obj.getValue());
        }
    }
}
