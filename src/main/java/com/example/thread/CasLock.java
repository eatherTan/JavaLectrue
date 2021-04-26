package com.example.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CasLock implements Runnable{
    private static final CountDownLatch latch = new CountDownLatch(5);
    private static AtomicInteger i = new AtomicInteger(0);
    private static int p = 0;

    @Override
    public void run() {
        for (int j = 0; j < 5000; j++) {
            i.incrementAndGet();
            p++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        CasLock casLock = new CasLock();
        new Thread(casLock).start();
        new Thread(casLock).start();
        new Thread(casLock).start();
//        latch.await();//保证所有子线程执行完成
        System.out.println("原子类的值"+ i);
        System.out.println("普通子类的值"+ p);

    }
}
