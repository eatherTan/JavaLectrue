package com.example.IOoperation;

/**
 * 递归
 */
public class RecursionTest {
    //循环方式计算阶乘
    public static int compute(int number){
        int result = 1;
        for (int i = 1; i<= number; i++){
            result *= i;
        }
        return result;
    }

    //使用递归去计算阶乘
    public static int recurtionCompute(int number){
        int result ;
        if (number == 1){
            return 1;
        }else {
            result = number * recurtionCompute(number-1);
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(compute(5));
        System.out.println(recurtionCompute(5));
    }
}
