package com.example.leetcode;

import java.util.HashMap;
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
        String s = "abcabtycbb";
        System.out.println(longestSubstringWithoutRepeat(s));
    }

    /**
     * 这种方式是把从每个字符开始的不重复子串都拿出来，每一个都比较长度，然后拿最大的长度
     *
     * 执行结果：
     * 第0 次for循环
     * abc
     * 移除元素a
     * 第1 次for循环
     * abc
     * 移除元素b
     * 第2 次for循环
     * abc
     * 移除元素c
     * 第3 次for循环
     * abc
     * 移除元素a
     * 第4 次for循环
     * bc
     * 移除元素b
     * 第5 次for循环
     * bc
     * 移除元素c
     * 第6 次for循环
     * b
     * 移除元素b
     * 第7 次for循环
     * b
     * 3
     * @param s
     * @return
     */
    private static int longestSubstringWithoutRepeat(String s) {

        Set<Character> characterSet = new HashSet<>();
        int right = 0; //从0开始比较，
        int result = 0;
        for (int left = 0; left < s.length(); left++) {
            while (right < s.length() && !characterSet.contains(s.charAt(right))){ //不存在重复的，就移动右指针,把字符加到set中
                characterSet.add(s.charAt(right));
                right ++;
            }
            System.out.println("第" +left + " 次for循环");
            characterSet.stream().forEach(System.out::print);
            System.out.println();

            if(right != s.length()){   //重要：这一步要放在
                System.out.println("移除元素" + s.charAt(left));
                characterSet.remove(s.charAt(left));
            }
            result = Math.max(result,right-left);
        }
        return result;
    }

    /**
     * 试着优化，把重复字符出现的位置记录下来
     * @param s
     * @return
     */
   /* private static int longestSubstringWithoutRepeat2(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey()){

            }
        }
    }*/


        private static int longestSubstringWithoutRepeat3(String s) {

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
