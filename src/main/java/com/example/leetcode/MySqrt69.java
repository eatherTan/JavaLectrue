package com.example.leetcode;

/**
 * 本题是一道常见的面试题，面试官一般会要求面试者在不使用 根号x函数的情况下，得到 x 的平方根的整数部分。
 * 一般的思路会有以下几种：
 * 通过其它的数学函数代替平方根函数得到精确结果，取整数部分作为答案；
 * 通过数学方法得到近似结果，直接作为答案。
 */
public class MySqrt69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));

        //第二种方式
        System.out.println(mySqrt1(2147483647));
    }

    /**
     * 不要直接使用平方根
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int result = (int) Math.sqrt(x);
        return result;
    }

    /**
     * 把x^1/2 使用数学函数替代，替代成形式不同的式子
     * x^1/2 = e^1/2(lnx)
     */
    public static int mySqrt1(int x){
        int ans = (int)Math.exp(0.5*Math.log(x));
        return (long)(ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
        //为什么要加上long呀？？
    }
}