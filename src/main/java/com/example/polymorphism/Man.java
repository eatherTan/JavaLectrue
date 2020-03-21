package com.example.polymorphism;

public class Man implements People {
    @Override
    public int eat() {
        return 0;
    }

    public static void main(String[] args) {

        int[] aa = {1,2,3};
        int[] bb = {1,2,3,1};
        System.out.println(equals(aa, bb));
    }

    public static boolean equals(int[] a , int[] b){

        if (a == b){
            return true;
        }
        if (a != null && b != null)
        if (a.length == b.length){
            for (int i = 0; i< a.length; i++){
                if (a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
