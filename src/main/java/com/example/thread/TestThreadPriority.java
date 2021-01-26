package com.example.thread;

/**
 * 线程的优先级
 */
public class TestThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
        MyPriority priority = new MyPriority();
        Thread thread1 = new Thread(priority);
        Thread thread2 = new Thread(priority);
        Thread thread3 = new Thread(priority);
        Thread thread4 = new Thread(priority);
        Thread thread5 = new Thread(priority);
        Thread thread6 = new Thread(priority);
        Thread thread7 = new Thread(priority);

        thread1.start();

        thread2.setPriority(1);
        thread3.setPriority(4);
        thread3.start();
        thread4.setPriority(10);
        thread4.start();

    }
}

class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
    }
}