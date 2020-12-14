package com.example.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 希尔排序：交换法
 */
public class ShellSortBySwap {
    public static void main(String[] args) {

        int[] arr = new int[80000];
        for (int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 80000);
        }
//        System.out.println("排序前：" + Arrays.toString(arr));
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = sdf.format(date1);
        System.out.println("排序前的时间是：" + date1Str);
        shellInsert(arr);
        Date date2 = new Date();
        String date2Str = sdf.format(date2);
        System.out.println("排序后的时间是：" + date2Str);


        /**
         * 这是希尔排序的推导步骤
         */
//        int[] arr = {8,9,1,7,2,3,5,4,6,0};
//        shellInsertStep1(arr);
//        shellInsertStep2(arr);
//        shellInsertStep3(arr);

    }

    /**
     * 把步骤整合后的希尔排序:使用的是交换法完成的希尔排序
     * @param arr
     */
    private static void shellInsert(int[] arr) {
        int count = 0;
        int temp = 0;
        for (int gap = arr.length/2; gap > 0; gap/=2 ) {

            for (int i = gap; i < arr.length; i++) {
                //1、遍历各组中的所有元素（共gap组，每组有x个元素）
                for (int j = i - gap; j >= 0; j -= gap) { // j-=gap,步长是gap
                    //3、如果当前元素arr[j] 大于 [当前位置 + 步长]arr[j+5]
                    if (arr[j] > arr[j + gap]) {
                        //4.这一步是使用的交换法，需要优化 -- 见 ShellSortByMove.java
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
//            System.out.println("第" + (++count) + "轮希尔排序" +  Arrays.toString(arr));
        }
    }

    // -------------------------------------------------------------------------------
    //逐步推导方式来编写希尔排序
    //希尔排序有两种方式实现：
    // 1.希尔排序时，对有序序列在插入时采用交换法，并测试排序速度
    // 2.希尔排序时，对有序序列在插入时采用移动法，并测试排序速度

    /**
     * 第一轮排序
     * @param arr
     */
    private static void shellInsertStep1(int[] arr) {
        //1、第一轮排序将10个数据，分成了5组
        for (int i = 5; i < arr.length; i++) {
            //2、遍历各组中的所有元素（共5组，每组有2个元素）
            for (int j = i-5; j >= 0; j-=5) { // j-=5,步长是5
                //3、如果当前元素arr[j] 大于 [当前位置 + 步长]arr[j+5]
                if (arr[j] > arr[j+5]){
                    int temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }
        System.out.println("希尔排序第一轮后 = " + Arrays.toString(arr));
    }

    /**
     * 第二轮排序
     * @param arr
     */
    private static void shellInsertStep2(int[] arr) {
        //1、第一轮排序将10个数据，分成了5组
        for (int i = 2; i < arr.length; i++) {
            //2、遍历各组中的所有元素（共5组，每组有2个元素）
            for (int j = i-2; j >= 0; j-=2) { // j-=5,步长是5
                //3、如果当前元素arr[j] 大于 [当前位置 + 步长]arr[j+5]
                if (arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println("希尔排序第二轮后 = " + Arrays.toString(arr));
    }
    /**
     * 第三轮排序
     * @param arr
     */
    private static void shellInsertStep3(int[] arr) {
        //1、第一轮排序将10个数据，分成了5组
        for (int i = 1; i < arr.length; i++) {
            //2、遍历各组中的所有元素（共5组，每组有2个元素）
            for (int j = i-1; j >= 0; j-=1) { // j-=5,步长是5
                //3、如果当前元素arr[j] 大于 [当前位置 + 步长]arr[j+5]
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("希尔排序第二轮后 = " + Arrays.toString(arr));
    }
}
