package com.example.sort;

//二分查找法
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(binarySearch(arr,3));
    }

    public static int binarySearch(int[] arr, int a){
        int high = arr.length-1;
        int low = 0;
        int mid = 0;
        while (low <= high){
            mid = (high+low)/2;
            if (arr[mid] == a){
                return mid+1;
            }else if (arr[mid] < a){
                low = mid+1;
                //low = mid; 会造成死循环
            }else {
                high = mid-1;
                //high = mid;  会造成死循环
            }
        }
        return -1;
    }
}
