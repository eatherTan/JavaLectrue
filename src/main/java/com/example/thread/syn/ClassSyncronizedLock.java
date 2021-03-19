package com.example.thread.syn;

import java.util.Date;


/**
 *  !! 类锁是所有线程共享的锁，所以同一时刻，只能有一个线程使用加了锁的方法或方法体，不管是不是同一个实例。
 *
 *  从这个例子可以看到，一下new了三个线程，但是类锁都是只被一个线程获取的，
 *
 * 运行结果：
 * 锁 ：kite-1
 * 线程开始时间Thu Mar 18 20:29:06 CST 2021
 * 线程结束时间Thu Mar 18 20:29:16 CST 2021
 * 锁 ：kite-3
 * 线程开始时间Thu Mar 18 20:29:16 CST 2021
 * 线程结束时间Thu Mar 18 20:29:26 CST 2021
 * 锁 ：kite-2
 * 线程开始时间Thu Mar 18 20:29:26 CST 2021
 * 线程结束时间Thu Mar 18 20:29:36 CST 2021
 */
public class ClassSyncronizedLock {
    private static Object lock = new Object();
    /**
     * 锁住静态变量
     * @throws InterruptedException
     */
    public void lockStaticObjectField() throws InterruptedException{
        synchronized (lock){
            System.out.println(Thread.currentThread().getName());
            System.out.println("线程开始时间" + new Date());
            Thread.sleep(10*1000);
            System.out.println("线程结束时间" + new Date());
        }
    }

    /**
     * 锁住静态方法
     * @throws InterruptedException
     */
    public static synchronized void methodLock() throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        System.out.println("线程开始时间" + new Date());
        Thread.sleep(10*1000);
        System.out.println("线程结束时间" + new Date());
    }

    /**
     * 锁住 xxx.class
     * @throws InterruptedException
     */
    public void lockClass() throws InterruptedException{
        synchronized (ClassSyncronizedLock.class){
            System.out.println(Thread.currentThread().getName());
            System.out.println("线程开始时间" + new Date());
            Thread.sleep(10*1000);
            System.out.println("线程结束时间" + new Date());

        }
    }

    public static void main(String[] args){

        Thread worker = new Thread(new ClassLockWorker());
        worker.setName("锁 ：kite-" + 1);
        worker.start();
        System.out.println(worker.getState());

        Thread worker2 = new Thread(new ClassLockWorker());
        worker2.setName("锁 ：kite-" + 2);
        worker2.start();
        System.out.println(worker2.getState());

        Thread worker3 = new Thread(new ClassLockWorker());
        worker3.setName("锁 ：kite-" + 3);
        worker3.start();
        System.out.println(worker3.getState());
    }

    public static class ClassLockWorker implements Runnable{
        @Override
        public void run() {
            try {
                ClassSyncronizedLock classLock = new ClassSyncronizedLock();
                // 方式 1
                classLock.lockStaticObjectField();
                // 方式 2
                //ClassLock.methodLock();
                // 方式 3
                //classLock.lockClass();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
