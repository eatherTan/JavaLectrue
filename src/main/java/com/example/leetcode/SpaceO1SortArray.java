package com.example.leetcode;

/**
 * 要求：空间复杂度为O(1), O(N)
 * 如: 给定{0,1,5,7,0,4},把0放到数组的最后，要求其他数字不能改变他们本来的顺序
 */
public class SpaceO1SortArray {

    public static void main(String[] args) {
        int[] num =  {0,1,5,7,0,4};
//        spaceO1SortArray(num);
        spaceO1SortArray1(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    private static void spaceO1SortArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == 0) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public static void spaceO1SortArray1(int[] num) {
        int left=0;
        int right = 0;
        for (int i = 0; left < num.length; left++) {
            if (num[i] == 0) {
                for (int j = i + 1 > right ? left + 1 : right; j < num.length; j++) {
                    if (num[j] != 0) {
                        int temp = num[j];
                        num[j] = num[i];
                        num[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    /**
     * 原地移除元素 {3,2,2,3},移除元素3
     * @param num
     * @param val
     */
    public void removeNum(int[] num,int val){
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val){
                num[index++] = num[i];
            }
        }
    }
}
