package com.example.base;

public class ContinueCase {

    public void forTest(){
        for (int i = 0; i < 3; i++){
            System.out.println( i );
            if (i == 1){
                break;
            }
            for (int j = 0; j <= i; ++j){
                if (1 == j){
                    continue;
                }
                System.out.println( "j=" + j);
            }
            System.out.println("i=" +  i);
        }
    }


    public static void main(String[] args) {
        ContinueCase a = new ContinueCase();
        a.forTest();

        int abc= 3;
        System.out.println(abc =+ 5);
        System.out.println();
    }
}
