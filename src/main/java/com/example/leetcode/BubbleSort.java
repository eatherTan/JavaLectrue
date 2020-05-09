package com.example.leetcode;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {8,6,5,4,3,1};
        sing(a);
    }

    /**
     * 冒泡排序算法
     * @param a
     */
    private static void sing(int[] a){
        for (int i = 0; i< a.length -1; i++){
            for (int j = 0 ; j<a.length - i -1; j++){
                int temp = 0;
                if(a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
                System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3] + " " +a[4]);
            }

        }
//        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+ "" +a[4]);
    }
}
