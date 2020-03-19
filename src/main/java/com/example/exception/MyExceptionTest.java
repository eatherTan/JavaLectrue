package com.example.exception;

public class MyExceptionTest {
    public void method(String str) throws MyException1, MyException2 {
        if (str == null){
            throw new MyException1("传入的字符串不能为空");
        }else if (str.equals("xiao")){
            throw new MyException2("此时结果为小");
        }
    }

    public static void main(String[] args) throws MyException1, MyException2 {
        try{
            MyExceptionTest test = new MyExceptionTest();
            String str = null;
            test.method(str);
        }
//        catch (MyException1 e){
//            System.out.println("进入到MyException1 模块");
//            e.printStackTrace();
//        }
        catch (MyException2 e){
            System.out.println("进入到MyException2 模块");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("进入到MyException2 模块");
            e.printStackTrace();
        }
        finally {
            System.out.println("finally 模块");
        }
    }
}
