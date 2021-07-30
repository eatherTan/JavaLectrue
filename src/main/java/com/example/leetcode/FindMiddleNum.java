package com.example.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindMiddleNum {

    public static void main(String[] args) {
        int[] nums = {1,3,7,7,5,6};
        System.out.println(findMiddleNum(nums));
    }

    /**
     * 找到中间那个数字的位置，使得该数字左侧和右侧的和相等
     * @param nums
     * @return
     */
    public static Integer findMiddleNum(int[] nums){
        //1.先把总数算出来
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            //
            total += nums[i];
            if (total == sum){
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }

}
