package com.example.sort;

/**
 * 基数排序
 */
public class RadixSort {
    public static void main(String[] args) {

    }

    public void radixSort(int[] arr){
        //第一轮排序（针对每个数的个位进行排序处理
        //1、定义10个二维数据，表示10个桶，每个桶就是一个一维数组；
        //2、为了防止溢出，每个一维数组的大小为arr.length
        //3、桶排序就是空间换时间的算法
        int[][] temp = new int[10][arr.length];

        //为了记录每个桶中，实际存放了多少个数据，我们定义一个一维数组来记录各个桶的每次放入数据的个数
        int[] backetCounts = new int[10];
    }
}
