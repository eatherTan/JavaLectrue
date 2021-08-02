package com.example.leetcode;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fiByRecurse(10));
        System.out.println(fiByRecurse2(10));

    }
    /**
     * 1.动态规划的方式
     * @param n
     * @return
     */
    public static int fib(int n) {
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

    /**
     * 暴力递归
     * 时间复杂度O(N^2)
     */
    public static int fiByRecurse(int index){
        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }
        return fiByRecurse(index-1)+fiByRecurse(index-2);
    }

    /**
     * 递归，减少重复计算
     * 暴力递归会有很多重复计算，因此可以使用数组来把计算过的值保存起来，下次再用
     * 时间复杂度O(N),空间复杂度O(N)
     */
    public static int fiByRecurse2(int index){
        int[] arr = new int[index+1];
        return recurse(arr,index-1)+recurse(arr,index-2);
    }

    private static int recurse(int[] arr,int i) {
        if (i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        if (arr[i] != 0){
            return arr[i];
        }
        arr[i] = recurse(arr,i-1) + recurse(arr,i-2);
        return arr[i];
    }
}
