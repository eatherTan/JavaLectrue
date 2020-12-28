package com.example.search;

import java.util.Arrays;

/**
 * 斐波那契查找法
 */
public class FibonacciSearch {

    public static int maxSize  = 20;

    public static void main(String[] args) {
        int arr[] = {1,8,10,89,1000,1234};
        System.out.println(fibSearch(arr,12345));
    }

    /**
     * 因为后面我们的mid = low + F(k-1)-1，需要用到斐波那契数列，因此我们需要先获取到一个斐波那契数据
     * 使用非递归方法得到一个斐波那契数列
     * @return
     */
    public static int[] fib(){
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }

    /**
     *
     * @param a 数组
     * @param key 要查找的关键值
     * @return 返回对应下标，如果没有就返回-1
     */
    public static int fibSearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;
        int k = 0;    //表示斐波那契 分割数值的下标
        int mid = 0;  //存放mid值
        int f[] = fib(); //获取到斐波那契数列

        //获取到斐波那契数列分割数值的下标
        while (high > f[k]-1){  //当high 小于等于 f[k]-1，就找到k的值
            k++;
        }

        //因为f[k]的值可能大于数组的长度，因此我们需要使用Arrays类，构造一个新的数组，并指向a[];
        //大于a.length的部分会用0填充
        int[] temp = Arrays.copyOf(a,f[k]);
        //实际上需要使用a数组的最后的数，填充temp
        //举例：
        //temp = {1,8,10,89,1000,1234,0,0,0 } => {1,8,10,89,1000,1234,1234,1234,1234}
        for (int i = high+1; i < temp.length; i++) {
            temp[i] = a[high];
        }
        //使用while 来循环处理，找到我们的数key
        while(low <= high){
            mid = low + f[k-1]-1;
            if (temp[mid] > key){
                high = mid-1;
                k--;
                //说明：k--;
                //1. 全部元素 = 前面的元素 + 后面的元素
                //2. f[k] = f[k-1] + f[k-2];
                //3. 因为前面有f[k-1]个元素，所以可以继续拆分为f[k-1] = f[k-2] + f[k-3]
                //4. 即在f[k-1]的前面继续查找，所以k--；
                //5. 下次循环时，mid = f[k-1-1]-1;
            }else if (key > temp[mid]){
                low = mid+1;
                k-=2;
                //说明：k-=2;
                //1. 全部元素 = 前面的元素 + 后面的元素
                //2. f[k] = f[k-1] + f[k-2];
                //3. 因为后面我们有f[k-2]个元素，所以可以拆分为f[k-2] = f[k-3] + f[k-4]
                //4. 即在f[k-2]的前面进行查找 k-=2
                //5. 即下次循环mid = f[k-1-2]-1
            }else {
                //找到了，但是需要确定，返回的是哪个下标
                if (mid <= high){
                    return mid;
                }else {
                    return high;
                }
            }
        }
        return -1;
    }
}
