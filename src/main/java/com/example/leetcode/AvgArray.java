package com.example.leetcode;

import java.util.Date;

public class AvgArray {

    public static void main(String[] args) {
        int arr[] = {0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(arr));
    }


    public static void compare(Date date1, Date date2) throws Exception {
        if (date1.getTime() > date2.getTime()){
            throw new Exception("开始时间应小于结束时间");
        }
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        //判断数组的长度，数组的长度小于3返回false
        if(A.length > 2){
            //求数组的和，求数组的和的三分之一
            int sum=0, avg=0;
            for(int i=0 ; i<A.length ; i++){
                sum = sum + A[i];
            }
            //判断数组的和是否是3的倍数，不是3的倍数的返回false
            int temp = sum % 3;
            if(temp == 0){
                avg = sum / 3;
                for(int i=0 ; i<A.length ; i++){
                    int count1=0;
                    count1 = count1 + A[i];

                    if(count1 == avg){
                        for(int j=i; j<A.length; j++){
                            int count2=count1;
                            count2 = count2 + A[j];
                            if(count2 == avg*2) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        // for(int i=0; i<time.length-1; i++){
        //     for(int j=i+1; j<time.length; j++){
        //         if((time[i] + time[j])%60 == 0){
        //             count++;
        //         }
        //     }
        // }
        int[] temp = new int[60];
        for(int i=0; i<time.length; i++){
            int a = time[i] % 60;
            temp[a] = temp[a] + 1;
        }
        for(int i=1; i<30; i++){
            if((temp[i]>0) && (temp[60-i]>0)){
                count = count + (temp[i]*temp[60-i]);
            }
        }
        if(temp[30]>0){
            count = count + (temp[30]*(temp[30]-1)/2);
        }
        if(temp[0]>0){
            count = count + (temp[0]*(temp[0]-1)/2);
        }
        return count;
    }
}