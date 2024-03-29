package com.example.leetcode;

/**
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 *
 * n = 5
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * 因为第三行不完整，所以返回2.
 */
public class L441ArrangeCoin {
    public static void main(String[] args) {
        System.out.println(shulie(2147483647));
    }
    public static int shulie(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (sum <= Integer.MAX_VALUE &&sum > n) {
                return i-1;
            }else if (sum > Integer.MAX_VALUE){
                return i;
            }
        }
        return 0;
    }
}
