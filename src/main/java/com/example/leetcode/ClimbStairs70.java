package com.example.leetcode;

/**
 * 青蛙爬楼梯，青蛙一次只能跳一级或2级楼梯
 * 现在有n阶楼梯，共有多少中跳法？
 */
public class ClimbStairs70 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(5));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n < 0){
            System.out.println("参数不合法");
            return -1;
        }
        if (n >= 0 && n <= 2) {
            return n;
        }
        int a = 1,b = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    /**
     * 递归的方式
     */
}
