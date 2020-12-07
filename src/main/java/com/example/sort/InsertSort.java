package com.example.sort;

public class InsertSort {

    public static void main(String[] args) {

    }

    /**
     * 插入排序好难啊
     * @param arr
     * @return
     */
    public int[] insertSort(int[] arr){
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
