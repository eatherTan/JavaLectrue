package com.example.leetcode;

public class L014LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower","flow","flowight"};
//        String[] strs = {"","b1","c"};
        System.out.println("pre 是" + longestCommonPrefix(strs));
        System.out.println("pre 是" + longestCommonPrefix2(strs));

        System.out.println();
//        System.out.println("b".substring(0,0));
//        System.out.println(1);
    }

    /**
     * 最长公共前缀
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        String pre = strs[0]; //一开始 ： 把第一个词当做是最长的公众前缀
        for (int i = 1; i < strs.length; i++){
            int j = 0;
            for (; j < strs[i].length() && j < pre.length(); j++){  //注意： j < pre.length() 这个条件要放在for中，不能放在下面的if中
                if ( pre.charAt(j) != strs[i].charAt(j) ){ //当第j个位置的字母一样时，j往后移，继续比较，当第j个位置的字母不一样时，停止后移，退出当前循环
                    break;
                }
            }
            pre = pre.substring(0,j);
            if (pre.equals("")){  //当前缀为空""时，可以直接返回，不用再比较了，减少比较次数
                return pre;
            }
        }
        return pre;
    }

    /**
     * 2021.7.22 完成公共最长子串，我认为更好理解一点
     * 使用while可以快速的代入语境
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs){
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j<pre.length() && j<strs[i].length() && pre.charAt(j) == strs[i].charAt(j) ){
                j++;
            }
            pre = pre.substring(0,j);
            if (pre.equals("")){
                return pre;
            }
        }
        return pre;
    }
}
