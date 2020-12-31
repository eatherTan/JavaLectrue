package com.example.leetcode;

public class PlusOne66 {

    public static void main(String[] args) throws Exception {
        int[] digits = {9,9};
        int[] digits1 = plusOne(digits);
        for (int i = 0; i < digits1.length; i++){
            System.out.print(digits1[i] + " ");
        }
    }

    /**
     * 感觉是一个很简单的数学题，但是自己要实现的时候好难
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits){
        int index = digits.length-1;
        for (int i = index; i >= 0; i--) {
            digits[i]++;
            digits[i]%=10;
            if (digits[i]!=0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    /**
     * int[] digits = {9,9};  这种情况时我没有处理好
     * @param digits
     * @return
     * @throws Exception
     */
    public static int[] plusOne1(int[] digits) throws Exception {
        if (digits.length > 0) {
            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
                return digits;
            } else if (digits[digits.length - 1] == 9) {
                int i = digits.length - 1;
                while (true) {
                    if (i > 0 && digits[i] == 9) {
                        digits[i] = 0;
                        digits[i - 1] += 1;
                        i--;
                    }
                    if (i == 0 && digits[i] == 9) {
                        int[] newDigits = new int[digits.length + 1];
                        newDigits[0] = 1;
                        return newDigits;
                    }
                    if (i >= 0 && digits[i] != 9) {
                        break;
                    }
                }
            }
        }
        return digits;
    }
}
