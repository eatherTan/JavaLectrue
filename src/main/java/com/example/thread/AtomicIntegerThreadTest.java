package com.example.thread;

//原子操作类AtomicInteger详解 : https://blog.csdn.net/fanrenxiang/article/details/80623884 ,这个多线程怎么运行不了呀
public class AtomicIntegerThreadTest {
    private static final int THREADS_CONUT = 20; //线程数
    public static int count = 0;

    public static void increase() {
        count++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(count);
    }

}
