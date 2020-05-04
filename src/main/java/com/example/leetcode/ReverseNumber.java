package com.example.leetcode;

/**
 * 翻转数字
 * 123 -> 321
 */
public class ReverseNumber {
    //思路：方法一数学方法： 可以使用余数的方式 x = n % 10
    //      方法二：
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverseNum(num));
    }

    public static String reverseNum(int num){
        StringBuilder s = new StringBuilder();
        int n = num % 10;

        while (n != 0){
            num = num % 10;
            s.append(num);
        }
        return s.toString();
    }

    /**
     * 翻转数字
     * 注意： 特殊情况，因为是int，int有最大值会有溢出的情况。
     * temp=rev⋅10+pop 溢出
     * @param x
     * @return
     */
    public static int reverse(int x){
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x = x/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)){
                return 0;
            }
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop < -8)){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
