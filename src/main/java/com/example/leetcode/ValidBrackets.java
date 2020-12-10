package com.example.leetcode;

import java.util.Stack;

//判断是否是有效的括号
public class ValidBrackets {

    public static boolean isValidBrackets(String str) throws Exception {
        if (str == null || str.length() == 1){
            return false;
        }
        Stack<String> bracket = new Stack<>();

//        for (int i = 0; i < str.length(); i++){
//            if (isLeftBracket(str.charAt(i))){
////                bracket.push()
//            }
//        }
        return false;
    }

    public static boolean isLeftBracket(char s) throws Exception {
        switch (s){
            case '(': return true;
            case '[': return true;
            case '{': return true;
            default : {
                System.out.println("未知等级");
                return false;
            }

        }
    }
}
