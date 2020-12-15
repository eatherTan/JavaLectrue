package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//判断是否是有效的括号
public class ValidBrackets {

    public static void main(String[] args) throws Exception {
        String str = "{[]}";
        System.out.println(isValidBrackets(str));
    }
    public static boolean isValidBrackets(String str) throws Exception {
        if (str == null || str.length()%2 == 1){
            return false;
        }
        Stack<Character> bracket = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for (int i = 0; i < str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                bracket.push(str.charAt(i));
            }else {
                if (bracket.isEmpty() == true || map.get(bracket.pop()) != str.charAt(i)){ //如果不是左括号，是有括号，那就是
                    return false;
                }
            }
        }
        if (bracket.isEmpty()){
            return true;
        }else {
            return false;
        }
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
