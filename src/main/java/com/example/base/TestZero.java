package com.example.base;

public class TestZero {
    public static void main(String[] args) {
        double a = -1.0/0;
        System.out.println(a);

        int i = 123467891;
        int j=1;
        System.out.println(i+j);

        String str = "123\\2]1134";
        System.out.println(str);

        Character c = new Character('1');
        c.isLetter('a');
        System.out.println("是否是字母" + c.isLetter('r'));


        String fs = "B";
        switch (fs){
            case "A":
                System.out.println("AAAAAAA");
                break;
            case "B":
                System.out.println("BBBBBBBBBBBAAAAAAA");
                break;
        }
    }
}
