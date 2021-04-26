package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 输入: s = ""
 * 输出: 0
 */
public class L003LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "hell0";
        System.out.println(longestSubstringWithoutRepeat(s));
    }

    private static int longestSubstringWithoutRepeat(String s) {

        Set<Character> characterSet = new HashSet<>();
        int right = 0; //从0开始比较，
        int result = 0;
        for (int left = 0; left < s.length(); left++) {
            while (right < s.length() && !characterSet.contains(s.charAt(right))){ //不存在重复的，就移动右指针,把字符加到set中
                characterSet.add(s.charAt(right));
                right ++;
            }
            if(right != s.length()){   //重要：这一步要放在
                System.out.println("移除元素" + s.charAt(left));
                characterSet.remove(s.charAt(left));
            }
            characterSet.stream().forEach(System.out::print);
            System.out.println();
            System.out.println(left);
            result = Math.max(result,right-left);
        }
        return result;
    }

    private static int longestSubstringWithoutRepeat2(String s) {

        Set<Character> characterSet = new HashSet<>();
        int right = -1; //从0开始比较，
        int result = 0;

        for (int left = 0; left < s.length(); left++) {
            if(left != 0){
                System.out.println("移除元素" + s.charAt(left));
                characterSet.remove(s.charAt(left));
            }
            while (right < s.length() && !characterSet.contains(s.charAt(right))){ //不存在重复的，就移动右指针,把字符加到set中
                characterSet.add(s.charAt(right));
                right ++;
            }

            characterSet.stream().forEach(System.out::print);
            System.out.println();
            System.out.println(left);
            result = Math.max(result,right-left-1);
        }
        return result;
    }


}
