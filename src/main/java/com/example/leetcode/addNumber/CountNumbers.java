package com.example.leetcode.addNumber;

/**
 * 找到和为target的两个数
 */
public class CountNumbers {

    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(nums,target);
        if (twoSum(nums,target) != null){
            System.out.println("[" + twoSum(nums,target)[0] + "," + twoSum(nums,target)[1] + "]");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[3];
        for(int i = 0; i< nums.length - 1; i++){
            for(int j = i+1; j<=nums.length -1; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
