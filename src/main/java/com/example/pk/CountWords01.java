package com.example.pk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords01 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 6, 5, 2};
        System.out.println(countWords(nums));
        System.out.println(countWords2(nums));
        System.out.println(countWords3(nums));

    }

    /**
     * 方法一：使用hashmap,返回数字出现次数大于1的数
     * 没有找到返回-1
     * @param nums
     * @return
     */
    public static int countWords(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);   //返回数字出现次数大于1的数,其实在这一步就可以返回
            }else {
                map.put(nums[i],new Integer(1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 暴力破解
     * @param nums
     * @return
     */
    public static int countWords2(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == nums[i]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    /**
     * 先把数组排序
     * @param nums
     * @return
     */
    public static int countWords3(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
