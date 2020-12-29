package com.example.leetcode;

/**
 * 青蛙爬楼梯，青蛙一次只能跳一级或2级楼梯
 * 现在有n阶楼梯，共有多少中跳法？
 */
public class ClimbStairs70 {
    public static void main(String[] args) {

    }


    public static int climbStairs(int n) {
        if (n < 0){
            return -1;
        }
        if (n >= 0 && n <= 2) {
            return n;
        }
        return 0;
    }
}
