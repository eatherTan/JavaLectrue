package com.example.leetcode;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(isPrimeNumber(num));
        System.out.println(maxPrimeNumber(20));
    }

    /**
     * 判断该数是不是质数
     * @param num
     * @return
     */
    public static boolean isPrimeNumber(int num){
        for (int i = 2; i <= 9; i++){
            int prime =  num % i;
            if (prime == 0 && prime != num){
                return false;
            }
        }
        return true;
    }

    /**
     * 寻找n以内最大的质数
     * @param n
     * @return
     */
    public static int maxPrimeNumber(int n){
        for (int i = n; i>=1; i--){
            if (isPrimeNumber(i)){
                return i;
            }
        }
        return n;
    }
}
