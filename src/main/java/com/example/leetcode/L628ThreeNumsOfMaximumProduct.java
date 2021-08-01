package com.example.leetcode;

/**
 * 三个数的最大乘积
 */
public class L628ThreeNumsOfMaximumProduct {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,5,6,7,7};
        System.out.println(getMaxProduct(nums));

    }
    public static int getMaxProduct(int[] num){
        int n = num.length;
        return Integer.max(num[0]*num[1]*num[2],num[n-1]*num[n-2]*num[n-3]);
    }
}
