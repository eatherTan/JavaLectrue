package com.example.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSortByMove {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 80000);
        }
//        System.out.println("排序前：" + Arrays.toString(arr));
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String date1Str = sdf.format(date1);
        System.out.println("排序前的时间是：" + date1Str);
        shellInsert(arr);
        Date date2 = new Date();
        String date2Str = sdf.format(date2);
        System.out.println("排序后的时间是：" + date2Str);
    }

    /**
     * 自己写一下希尔排序
     * @param arr
     */
    public void shellSort1(int[] arr){
        for (int gap = arr.length/2; gap > 0 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int j = 1; //要插入的index
                int temp = arr[j];

                if (arr[j] < arr[j-gap]){
                    while (j-gap >= 0 && temp < arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j-=gap;
                    }
                }
                arr[j-gap] = temp;
            }
        }
    }





    /**
     * 对交换式的希尔排序进行优化
     * 使用移位法完成
     */
    /**
     * 把步骤整合后的希尔排序:使用的是移位法完成的希尔排序
     * @param arr
     */
    private static void shellInsert(int[] arr) {
        int count = 0;
        //增量gap,并逐个缩小增量
        for (int gap = arr.length/2; gap > 0; gap/=2 ) {
            //1、从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                    int j = i;
                    int temp = arr[j]; //要插入的元素
                    if (arr[j] < arr[j-gap]) {
                        while ( j-gap >= 0 && temp < arr[j-gap]){
                            //移动
                            arr[j] = arr[j-gap];
                            j -= gap;
                        }
                        //当退出while循环后，就给temp找到了插入的位置
                        arr[j] = temp;
                    }

            }
//            System.out.println("第" + (++count) + "轮希尔排序" +  Arrays.toString(arr));
        }
    }
}
