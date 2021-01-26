package com.example.thread;

public class TestYield {

    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }


/**
 * 执行结果是下面的输出： 礼让成功了
 * b线程开始执行
 * a线程开始执行
 * b线程开始停止执行
 * a线程开始停止执行
 */
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程开始停止执行");
    }
}