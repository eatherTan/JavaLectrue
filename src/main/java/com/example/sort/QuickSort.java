package com.example.sort;

//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr,int left, int right){
        int low = left;
        int high = right;
        int key = arr[left];
        while (low != high){
            while (low < high && arr[high] >= key){
                high--;
            }
            while (low < high &&  arr[low] <= key){
                low++;
            }
            if (low < high) {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }
        arr[left] = arr[low];
        arr[low] = key;
        quickSort(arr,left,low-1);
        quickSort(arr,low+1,high);
    }

}
