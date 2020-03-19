package com.example.exception;

public class ExceptionTest {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            String message = "";
            int a = 0;
            try{
                if (i == 1){
                    throw new Exception("错误");
                }
                message = "正确";
                a= 123;
            }catch (Exception e){
                message = e.getMessage();
            }
            System.out.println( "i 等于" + i);

            System.out.println(message );
            System.out.println("a = " + a+ "\n");
        }
    }
}
