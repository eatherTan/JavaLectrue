package com.example.pk;

import java.util.Arrays;

/**
 * 给定整形数组，找出三个数的乘积是最大的三个数
 */
public class ThreeNumMutiply02 {
    /**
     * 使用遍历，如果都是大于0 的数，取最大的三个数即可
     * 如果都是小于0的数，取最大的三个数即可
     * 既有大于0也有小于0，要不就是取最大的三个，要不就是取最大数和最小的那两个负数
     * @param nums
     * @return
     */
    public static int[] findThreeNums(int[] nums){
        if (nums.length < 3){
            return null;
        }
        Arrays.sort(nums);
        int[] arr1 = {nums[0],nums[1],nums[2]};
        int[] arr2 = {nums[0],nums[nums.length-2],nums[nums.length-1]};
        int n1 = nums[0]*nums[1]*nums[2];
        int n2 = nums[0]*nums[nums.length-2]*nums[nums.length-1];
        if (n1 >= n2){
            return arr1;
        }else {
            return arr2;
        }
    }

    /**
     * 快速排序
     */
    /*private static void sort(int[] nums,int low, int high) {
        int left = low, right = high;
        int key =
    }*/
}
