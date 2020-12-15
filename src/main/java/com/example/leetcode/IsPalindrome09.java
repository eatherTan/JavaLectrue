package com.example.leetcode;

public class IsPalindrome09 {
//    输入: 121
//    输出: true
//    输入: -121
//    输出: false
//    解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));

    }
    /**
     * 验证是否是回文数
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        //小于0 或者 能被10整除的数都不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int a = 0;
        int b = x;
        while (x > 0){
            a = a*10 + x%10;
            x = x/10;//算出除数
        }
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
