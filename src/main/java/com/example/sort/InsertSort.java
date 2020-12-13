package com.example.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertSort {

    public static void main(String[] args) {
        /*int[] arr = {114,109,1,34};
        insetSort(arr);
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }*/

        //计算算法运行时间：
        int[] arr = new int[80000];
        for (int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 80000);
        }
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = sdf.format(date1);
        System.out.println("排序前的时间是：" + date1Str);
        insetSort(arr);
        Date date2 = new Date();
        String date2Str = sdf.format(date2);
        System.out.println("排序后的时间是：" + date2Str);
    }

    public static void insetSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int insertIndex = i;
            int x = arr[insertIndex];   //需要把要插入的元素记下来！！ 很重要。 如果直接用arr[insertIndex]，在元素后移的过程中，会把arr[insertIndex]给覆盖掉
            int index = i-1;
            while (index >= 0 && x < arr[index]){  //如果要插入的元素比前面的元素更小，
                arr[index + 1] = arr[index];
                index --;
            }
            arr[index+1] = x;
        }
    }
    /**
     * 插入排序
     * 使用 两个for循环完成插入排序？？
     * @param arr
     * @return
     */
    public int[] insertSort1(int[] arr){
        if (arr.length == 0 || arr.length == 1){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[0];
            for (int j = i + 1; j > -1; j--){
                if (arr[j] < arr[i]) {

                    arr[j+1] = arr[j];
                }
            }

        }

        for (int i = 2; i <= arr.length; i++){
            for (int j = i+1; j > -1; j--)
            if (arr[j] < arr[0]){
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
            }
        }
        return null;
    }
}
