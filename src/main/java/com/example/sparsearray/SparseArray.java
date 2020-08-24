package com.example.sparsearray;

import java.io.*;

public class SparseArray {

    public static void main(String[] args) {
        int arr[][] = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        System.out.println("-----------  二维数组： ---------------");
        for (int[] row : arr){
            for (int i : row){
                System.out.printf("%s\t",i);
            }
            System.out.println();
        }
        //---------一、把二维数组转化成稀疏数组----------
        //1.获取sum值
        int sum = 0;
        for (int[] row : arr){
            for (int i : row){
                if (i != 0){
                    sum++;
                }
            }
        }
        //2.创建稀疏数组，有3列，第3列存值
        int[][] sparseArr = new int[sum+1][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr[0].length;
        sparseArr[0][2] = sum;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }
        System.out.println("-----------  稀疏数组： ---------------");
        for (int[] row : sparseArr){
            for (int i : row){
                System.out.printf("%s\t",i);
            }
            System.out.println();
        }

        //-----------把稀疏数组转化成二维数组-----------
        int[][] array = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i< sparseArr.length;i++){
            for (int j=0; j< sparseArr[i].length;j++){
                array[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
            }
        }
        System.out.println("-----------  稀疏数组转换成二维数组： ---------------");
        for (int[] row : array){
            for (int i : row){
                System.out.printf("%s\t",i);
            }
            System.out.println();
        }

        //课后作业：把稀疏数组写入文件中，再读取出来
        File file = new File("D:/ProjectCode/sparceArray.txt");
        try {
            FileOutputStream stream = new FileOutputStream(file);
            for (int i = 0; i < sparseArr.length; i++){
                for (int j = 0; j < sparseArr[i].length; j++){
                    stream.write(sparseArr[i][j]);
                }
            }
            int[][] newArr = new int[sparseArr[0][0]][sparseArr[0][1]];
            FileInputStream fileInputStream = new FileInputStream("D:/ProjectCode/sparceArray.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

