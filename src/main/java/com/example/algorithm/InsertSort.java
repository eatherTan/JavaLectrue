package com.example.algorithm;

public class InsertSort {

    public static void main(String[] args) {
        int[] array={4,2,7,3,5,4,0,45,16,36};
        insertionSort(array);
        System.out.println();
    }

    //从小到大排序
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

    }

    //从大到小排序
    public static void insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}
