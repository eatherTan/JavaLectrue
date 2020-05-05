package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSingleNum {
    /**
     * 方法一：
     * 这里计算出了次数，适合用于需要统计数字出现的次数
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i]) ){
                map.put(new Integer(nums[i]),new Integer(1));
            }else {
                map.put(new Integer(nums[i]), (Integer) (map.get(i).intValue() + 1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue().intValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }

    /**
     * 方法二：
     * 就使用Map 来放入数据，如果元素在map中已经存在，那就把map中的那个元素移除
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else {
                map.put(nums[i],null);
            }
        }
        return map.keySet().iterator().next();
    }

    /**
     * 使用List进行操作
     * @param nums
     * @return
     */
    public int singleNumber3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (list.contains(nums[i])){
                list.remove(nums[i]);
            }else {
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }
}
