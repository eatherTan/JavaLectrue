package com.example.leetcode;

import java.util.regex.Pattern;

/**
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 输入: "42"
 * 输出: 42
 */
public class L008MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }

    /**
     * 目前有点问题
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        String num = s.trim();
        Pattern pattern = Pattern.compile("[0-9]");
        if(num.substring(0,1) != "-" || !num.substring(0,1).matches("[0-9]")){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++){
            if (num.substring(i,i+1).matches("[0-9]")){
                sb.append(i);
                i++;
            }else {
                break;
            }
        }
        int res = Integer.parseInt(sb.toString());
        return res;
    }
}
