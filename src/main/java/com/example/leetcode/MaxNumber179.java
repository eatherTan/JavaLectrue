package com.example.leetcode;

import java.util.Arrays;

/**
 *
 给定一组非负整数 nums，重新排列它们每个数字的顺序（每个数字不可拆分）使之组成一个最大的整数。

 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。


 ```
 示例 1：

 输入：nums = [10,2]
 输出："210"
 示例 2：

 输入：nums = [3,30,34,5,9]
 输出："9534330"
 示例 3：

 输入：nums = [1]
 输出："1"
 示例 4：

 输入：nums = [10]
 输出："10"
 ```
 */

public class MaxNumber179 {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }

//    public String largestNumber(int[] nums) {
//        String[] strs = new String[nums.length];
//        for(int i = 0; i < nums.length; i++)
//            strs[i] = String.valueOf(nums[i]);
//        Arrays.sort(strs, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));//lambda表达式
//        StringBuilder res = new StringBuilder();
//        for(String s : strs) {
//            if(res.toString().equals("0")) res.delete(0,1);
//            res.append(s);
//        }
//        return res.toString();
//    }

    public static String largestNumber(int[] nums) {
        int len = nums.length;
        String[] strs = new String[len];
        for(int i=0;i<len;i++){
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs,0,len-1);
        String res = "";
        for(String str:strs){
            if(res.equals("0")) res = str;
            else res += str;
        }
        return res;
    }
    //基准元素，比基准小的的元素移动到右边，比基准小的元素移动到左边，从而把数列拆解成两个部分。
    public static void quickSort(String[] strs, int startIdx,int endIdx){
        if(startIdx>endIdx) return;
        int pivotIdx = partition(strs,startIdx,endIdx);
        quickSort(strs,startIdx,pivotIdx-1);
        quickSort(strs,pivotIdx+1,endIdx);
    }

    public static int partition(String[] strs, int startIdx, int endIdx){
        //key
        String pivot = strs[startIdx];
        int left = startIdx;
        int right = endIdx;
        while(left<right){
            while(left<right&&(strs[right]+pivot).compareTo(pivot+strs[right])<0) right--;//可能到left的位置，所以都要left<right判断
            while(left<right&&(pivot+strs[left]).compareTo(strs[left]+pivot)<=0) left++;
            if(left<right){
                String tmp = strs[left];
                strs[left] = strs[right];
                strs[right] = tmp;
            }
        }
        strs[startIdx] = strs[left];
        strs[left] = pivot;
        return left;
    }
}
