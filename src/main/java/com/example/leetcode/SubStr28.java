package com.example.leetcode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 */
public class SubStr28 {

    public static void main(String[] args) {
        String hello = "hello";
        System.out.println(hello.substring(2,4));
        System.out.println(strStr(hello,"ll"));

    }
    /**
     * 输入: haystack = "hello", needle = "ll"
     * 输出: 2
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() < needle.length()){
            return -1;
        }
        int L = needle.length();
        int n = haystack.length();
        for (int i = 0; i < n-L+1; i++){
            if( haystack.substring(i,i+L).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
