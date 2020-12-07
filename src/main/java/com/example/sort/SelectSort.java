package com.example.sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {119,34,1,101};
        selectSort(arr);

//        selectSortStep1(arr);  //此时就是最小值和对应位置的数据交换，第一次交换后：1 34 119 101
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    /**
     *选择排序
     * 选择排序的基本思想是 ： 第一次从arr[0] 到 arr[n-1]中选取最小值，与arr[0] 交换，
     * 第二次从a[1] 到 arr[n-1]中选取最小值，与arr[1] 交换，.......
     * 第n-1次从arr[n-2] 到 arr[n-1]中选取最小值与arr[n-2]交换，
     * 总共通过n-1次查找交换得到一个按照从小到大排序的有序序列。
     * @param arr
     */
    public static void selectSort(int[] arr) {
        //第一步，找到最小值
        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j; //假设第一个值是最小值，如果在后续的对比中，发现第一个不是最小值，那就把比他的小的那个数换成最小值
            int min = arr[j];
            for (int i = 1+j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
        }
    }

    public static void selectSortStep1(int[] arr) {
        //第一步，找到最小值
        int minIndex = 0; //假设第一个值是最小值，如果在后续的对比中，发现第一个不是最小值，那就把比他的小的那个数换成最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = arr[0];
        arr[0] = min;
    }

}
