package com.example.thread.syn;

/**
 * 查看对象锁和类锁:线程获得对象锁的同时，也可以获得类锁，类锁和对象锁是两个不一样的锁，互不干扰
 */
public class TestSynchronized {
    //对象锁
    public synchronized void test1() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
    //类锁
    public static synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    /**
     * 线程获得对象锁的同时，也可以获得类锁，类锁和对象锁是两个不一样的锁，互不干扰
     * @param args
     */
    public static void main(String[] args) {
        final TestSynchronized myt2 = new TestSynchronized();
        Thread test1 = new Thread(new Runnable() {
            public void run() {
                myt2.test1();
            }
        }, "test1");
        Thread test2 = new Thread(new Runnable() {
            public void run() {
                TestSynchronized.test2();
            }
        }, "test2");
        test1.start();
        test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
    }
}
