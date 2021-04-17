package com.example.leetcode;

public class L058LengthOfLastWord {
    public static void main(String[] args) {
//        String s = "Hello World! ";
        String s = "t";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord2(s));
    }

    /**
     * 使用split()
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if (str.length == 0){
            return 0;
        }
        return str[str.length-1].length();
    }

    /**
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord2(String s) {
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0 ){
                continue;
            }else if (s.charAt(i) != ' '){
                count++;
            }else if (count != 0 && s.charAt(i) == ' '){
                break;
            }
        }
        return count;
    }
}
