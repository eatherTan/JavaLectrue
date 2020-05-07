package com.example.leetcode;

/**
 * 泰波那契序列 Tn 定义如下： 
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 */
public class Tribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        if (n == 0 || n== 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        int a = 0, b = 1, c = 1;
        int fn = 0;
        for (int i =3; i <= n; i++){
            int temp =  a + b + c;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
