package com.example.thread;

/**
 * 静态代理设计模式
 *
 * new WeddingCompany(new You()).happyMarry();
 *
 * //new Thread(线程对象).start();
 */
public class ThreadByImplementRunnable implements Runnable{

    @Override
    public void run() {
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
        ThreadByImplementRunnable thread1 = new ThreadByImplementRunnable();
        ThreadByImplementRunnable thread2 = new ThreadByImplementRunnable();
        ThreadByImplementRunnable thread3 = new ThreadByImplementRunnable();
        //Thread t1 = new Thread(thread1);
        //t1.start();
        //上面两步还可以变成
        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();

        System.out.println(Thread.currentThread().getName());

    }
}
