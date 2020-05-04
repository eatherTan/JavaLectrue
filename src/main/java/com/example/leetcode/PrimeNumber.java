package com.example.leetcode;
//质数
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPrimeNumber(num));
        System.out.println(maxPrimeNumber(num));
        System.out.println(numOfPrime(10));
    }

    /**
     * 判断该数是不是质数
     * @param num
     * @return
     */
    public static boolean isPrimeNumber(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i*i <= num; i++){
            int prime =  num % i;
            if (prime == 0 && i != num){
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
        for (int i = n; i>=2; i--){
            if (isPrimeNumber(i)){
                return i;
            }
        }
        return n;
    }

    /**
     * 寻找n以内的质数的数量,不包括n
     * @param n
     * @return
     */
    public static int numOfPrime(int n){
        int m = 0;
        for (int i = n-1; i>=1; i--){
            if (isPrimeNumber(i)){
                m++;
                System.out.println(i);
            }
        }
        return m;
    }
}
