package com.example.polymorphism;

public class Sort {
    public static void main(String[] args) {
        int[] number = {13,15,24,99,4,1};
        String end = "\n";
        int index;
        for (int i = 1;i < number.length;i++) {
            index = 0;
            for(int j = 1;j <= number.length-i;j++) {
                if (number[j] > number[index]) {
                    index = j;    // 查找最大值
                    System.out.println("最大值的index： "+index);
                }
            }
            end = number[index] + " " + end;    // 定位已排好的数组元素
            int temp = number[number.length-i];
            number[number.length-1] = number[index];
            number[index] = temp;
            System.out.print("【");
            for (int j = 0;j < number.length-i;j++) {
                System.out.print(number[j]+" ");
            }
            System.out.print("】"+end);
        }
    }
}
