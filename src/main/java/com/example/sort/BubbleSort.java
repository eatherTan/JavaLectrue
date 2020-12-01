package com.example.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,7,6,8};
        bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }

    /**
     * 从小到大排序
     * @param arr
     * N个数字冒泡排序，总共要进行N-1趟比较，每趟的排序次数为(N-i)次比较
     */
    public static void bubbleSort(int[] arr){
        //一定要记住判断边界条件，很多人不注意这些细节，面试官看到你的代码的时候都懒得往下看，你的代码哪个项目敢往里面加？
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){ //前一位比后一位大，则交换顺序
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        System.out.println("最终得出的数组为：");
        for (int k =0 ; k < arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    /**
     * 冒泡排序的优化
     * 1.使用标识符来标记数字是否进行过交换
     * @param arr
     */
    public static void bubbleSortUpgrade(int[] arr){
        //一定要记住判断边界条件，很多人不注意这些细节，面试官看到你的代码的时候都懒得往下看，你的代码哪个项目敢往里面加？
        if(arr==null||arr.length<2){
            return;
        }
        boolean flag = false; //标便令，表示是否进行过交换
        //需要进行arr.length趟比较
        for(int i = 0 ;i<arr.length-1;i++){
            //第i趟比较
            for(int j = 0 ;j<arr.length-i-1;j++){
                //开始进行比较，如果arr[j]比arr[j+1]的值大，那就交换位置
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag == false){ //在一趟排序中，一次都没有交换过
                break;
            }else {
                flag = false; //重置flag，进行下次判断
            }
        }
        System.out.println("最终得出的数组为：");
        for (int k =0 ; k < arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
