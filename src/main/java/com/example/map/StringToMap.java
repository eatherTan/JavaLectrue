package com.example.map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;
import java.util.Map;

public class StringToMap {
    public static void main(String[] args) {
        String param = "xiao";
        Map<String,String> map = JSON.parseObject(param, new TypeReference<Map<String,String>>(){});
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
