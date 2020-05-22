package com.example.leetcode;

public class MaxPrefix14 {

    public static void main(String[] args) {
//        String[] strs = { "flower","flow","flight"};
        String[] strs = {"c","c"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println();
    }
    public static String longestCommonPrefix(String[] strs) {
            int strLength = strs.length;
            String prefix = "";
            int isContain = 1;
            int result = 0;
            if (strs != null) {
                if (strs.length == 0) {
                    return "";
                }
                if (strs.length == 1) {
                    return strs[0];
                }
                String str1 = strs[0];
                for (int i = 0; i <= str1.length(); i++) {
                    if (isContain < 0) {
                        break;
                    }
                    prefix = str1.substring(0, i);
                    for (int j = 0; j < strLength; j++) {
                        isContain = strs[j].indexOf(prefix);
                        if (isContain < 0) {
                            break;
                        }
                    }

                }
            }
            return prefix.substring(0, prefix.length() - 1);
        }


}
