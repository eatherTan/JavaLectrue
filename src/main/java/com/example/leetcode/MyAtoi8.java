package com.example.leetcode;

import java.util.regex.Pattern;

public class MyAtoi8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("o"));
    }
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
