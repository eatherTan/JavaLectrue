package com.example.thread;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程是" + Thread.currentThread().getName() + "vip来了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        //主线程
        for (int i = 0; i < 500; i++) {
            if (i == 200){
                thread.join(); //线程插队，然后主线程才能执行
            }
            System.out.println("main" + i);
        }

    }
}
