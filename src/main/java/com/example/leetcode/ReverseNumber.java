package com.example.leetcode;

import org.springframework.util.StringUtils;

/**
 * 翻转数字
 * 123 -> 321
 */
public class ReverseNumber {
    //思路：方法一数学方法： 可以使用余数的方式 x = n % 10
    //      方法二：
    public static void main(String[] args) {
        int num = 123;
       /* System.out.println(reverseNum(num));
        System.out.println(reverse2(46677));
        String a = "seurheurh";*/
       String sss = "123456789";
       //StringBuffer sb = new StringBuffer(sss);
       //String str = revese111 (sss);

       revese222(sss);
        System.out.println("1111");
    }

    private static void revese222(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0,j=s.length()-1; i < s.length()-1; i++,j--) {
            if(j>=i) {
                char temp = s.charAt(i);
                chars[i] = chars[j];
                chars[j] = temp;
            }
        };
        System.out.println(chars);
    }

    private static String revese111(String s) {
        if(s.length()==1) return s;
        return s.charAt(s.length()-1)+revese111(s.substring(0,s.length()-1));
    }

    /**
     * 会溢出
     * @param num
     * @return
     */
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
    public static int reverse1(int x){
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
    /**
     * 方法二
     */
    public static int reverse2(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
