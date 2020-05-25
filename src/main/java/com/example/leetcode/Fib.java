package com.example.leetcode;

/**
 * 斐波那契数列
 */
public class Fib {

    public int fib(int n) {
        int a = 0, b = 1;
        // 前两项直接返回对应的值。
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        }
        // 第三项开始循环计算前两项的和。
        while (n > 1) {
            int temp = (a + b) % 1000000007;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }

}
