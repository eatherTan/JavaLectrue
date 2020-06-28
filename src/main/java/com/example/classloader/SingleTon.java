package com.example.classloader;

public class SingleTon {

    //private static SingleTon singleTon = new SingleTon();
    private static int counter1;
    private static int counter2 = 0;
    private static SingleTon singleTon = new SingleTon();
    public SingleTon(){
        counter1++;
        counter2++;
    }
    public static SingleTon getInstance(){
        return singleTon;
    }

    public static void main(String[] args) {
        System.out.println(counter1);
        System.out.println(counter2);
    }
    //private static SingleTon singleTon = new SingleTon(); 这句话的位置不同，输出的counter值也不同
    //因为类加载原因导致，加载-链接-初始化
    //链接的准备阶段，给静态变量赋上默认值，初始化时，再给静态变量赋上用户自定义的值
}

