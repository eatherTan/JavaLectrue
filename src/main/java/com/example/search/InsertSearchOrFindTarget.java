package com.example.search;

/**
 * 插入排序的应用：
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class InsertSearchOrFindTarget {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9}; //1
        System.out.println(searchInsert(arr,2));
        System.out.println(binarySearch(arr,10));
    }
    /**
     * 原来是要使用二分法，我自己的判断，好简陋
     */
    public static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while (left <= right){    //二分法，这里要使用 <= 不是很理解呀
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return 0;   //这里最后返回left, 也不太理解
    }

    /**
     * 为啥自己写的好low
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < target){
                index = i;
            }else if (nums[i] >= target){
                return i;
            }
        }
        return index+1;
    }
}
