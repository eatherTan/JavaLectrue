package com.example.leetcode.maxSubString;

import java.util.HashMap;
import java.util.Map;

public class MaxSubString {

    public static void main(String[] args) {
        String s = "pwwkew12";
        ;
        System.out.println(lengthOfLongestSubstring(s));
    }

    /**
     * 竟然看不懂 晕
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}
