package com.example.thread;

public class ThreadByExtendsThread extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在听课====" + i);
        }
        System.out.println("==========");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadByExtendsThread thread1 = new ThreadByExtendsThread();
        ThreadByExtendsThread thread2 = new ThreadByExtendsThread();
        ThreadByExtendsThread thread3 = new ThreadByExtendsThread();
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(Thread.currentThread().getName());
        //数字紊乱，发现不是按照i的顺序来执行的，有线程安全问题
    }
}
