package com.serializable;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest {
    public static void main(String[] args) {
        SortedMap<String, Charset> map = Charset.availableCharsets();
//        Set<String> set = map.keySet();
        Set set1 = map.entrySet();
//        for (Iterator iterator = set.iterator(); iterator.hasNext();){
//            String str = (String) iterator.next();
//            System.out.println(str);
//        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();){
            Map.Entry entry = (Map.Entry) iterator.next();
            String str1 = (String) entry.getKey();
            Charset charset = (Charset) entry.getValue();
//            System.out.println(str1);
            System.out.println(charset);
        }
    }
}
