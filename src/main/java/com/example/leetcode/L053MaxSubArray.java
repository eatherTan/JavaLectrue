package com.example.leetcode;

//给定一个整数数组 nums ，
// 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//输入: [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
public class L053MaxSubArray {
    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
        System.out.println(maxSubArrayDynamic(num));
    }

    /**
     * 暴力解法
     * @param num
     * @return
     */
    private static int maxSubArray(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            int temp = 0;
            for (int j = i; j < num.length; j++){
                temp += num[j];
                max = Math.max(max,temp);
            }
        }
        return max;
    }

    /**
     * 艰难----
     * 动态规划:不会
     * 贪心算法也不会
     */
    public static int maxSubArrayDynamic(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        // 最后不要忘记全部看一遍求最大值
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
