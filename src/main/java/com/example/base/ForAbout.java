package com.example.base;

public class ForAbout {

    public static void main(String[] args) {
//        String a = "3";
//        switch (a){
//            case "3":
//                System.out.println("a=3");
//            case "2":
//                System.out.println("a=2");
//                break;
//        }

        for (int i=0; i<=3; i++){
            if (i == 2){
                continue;
            }
            System.out.println(123 + "" + i);
        }
        System.out.println("默认输出");
    }
}
