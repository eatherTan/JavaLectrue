package com.example.leetcode;

public class SearchInsert {
//    假设升序
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int i = searchInsert(nums,2);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
    // 先查询，再插入
        for (int i = 0; i< nums.length - 1; i++){
            if (nums[i] == target){
                return i;
            }
        }
        if (target < nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        for (int i = 0; i< nums.length - 1; i++){
            if (nums[i] < target && nums[i+1] > target){
                return i;
            }
        }
        return 0;
    }
}
