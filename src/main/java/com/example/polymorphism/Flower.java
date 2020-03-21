package com.example.polymorphism;

public class Flower {

    public static void main(String[] args) {
        int[] a = {8,6,5,4,3,1};
        sort(a);
        //System.out.println();
//        sing(a);
    }

    private static void sort(int[] a) {
        int count = 0;
        for(int i= 0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                int temp = 0;
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    count++;
                }
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+ " " +a[4]+" "+a[5]);
        System.out.println(count);
    }

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
