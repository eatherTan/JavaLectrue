package com.example.leetcode;

/**
 * 爬楼梯的方式
 */
public class ClimbStairs {
    public int climbStairs(int n) throws Exception {
        if (n >= 0) {
            if (n <= 2) {
                return n;
            }
            int a = 1, b  = 2;
            for (int i = 3; i < n ; i++){
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }else {
            throw new Exception("楼梯数应为正数");
        }

    }
}

