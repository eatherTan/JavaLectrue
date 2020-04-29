package com.example.leetcode.addNumber;

/**
 *给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
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
