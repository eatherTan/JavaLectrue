package com.example.leetcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 */
public class L001TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSumByBinarySearch(nums,target);//twoSum(nums,target);
        System.out.println(result[0] + "" + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target-nums[i]) != null){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }else {
                map.put(nums[i],i);
            }
        }
        result[0]=-1;
        result[1]=-1;
        return result;
    }

    /**
     * 题目变换：如果给定的数组是有序的，现在有一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * 解题思路：可以使用 二分法查找存不存在 x-num[i] ，不存在的话，就i自增，继续查找；找到的话，就返回这两个数的位置
     * 相对于暴雨解法，使用二分法查找元素上更快。时间复杂度是nlogN
     *
     */
    public static int[] twoSumByBinarySearch(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i<nums.length; i++){
            int j = findNumNByBinarySearch(nums,target-nums[i],i+1,nums.length-1);
            if (j>0){
                result[0]=i;
                result[1]=j;
                return result;
            }

        }
        result[0]=-1;
        result[1]=-1;
        return result;
    }

    public static int findNumNByBinarySearch(int[] nums, int target,int left, int right){
        int mid = 0;
        while (left<=right){
            mid = (left+right)/2;
            if (target < nums[mid]){
                right=mid-1;
            }else if (target > nums[mid]){
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 如果给定的数组是有序的,使用双指针的方式来寻找 两个数的和等于目标值
     *
     */
    public static int[] twoSumPoint(int[] nums, int target) {
        int[] result = new int[2];
        int low = 0, high = nums.length-1;
        while (low < high) {
            if (target == nums[low] + nums[high]) {
                result[0] = low;
                result[1] = high;
                return result;
            }else if (target > nums[low] + nums[high]){
                low++;
            }else {
                high--;
            }
        }
        result[0]=-1;
        result[1]=-1;
        return result;
    }
}
