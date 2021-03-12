package com.example.thread;

//测试停止线程
//1建议线程正常停止 ---> 利用次数，不建议死循环
//2建议使用标志位 ---> 设置一个标志位
//3不要使用stophuozhe destroy等过时或者JDK不建议使用的方法
public class TestThreadStop implements Runnable {

    //设置标志位
    private boolean flag = true;

    @Override
    public void run() {
        int j = 0;
        while (flag) {
            System.out.println("main " + j);
            if (j==10) {
                System.out.println("线程该停止了" + Thread.currentThread().getName());
                stopThread();
            }
            System.out.println("run .... Thread" + j++);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("main " + i);
            if (i==50) {
                System.out.println("线程该停止了2" + Thread.currentThread().getName());
                stopThread();
            }
        }
    }

    /**
     * 通过用flag 方式来停止线程
     */
    public void stopThread () {
        this.flag = false;
    }

    public static void main (String[]args){
        TestThreadStop testThreadStop = new TestThreadStop();
        new Thread(testThreadStop).start();

//        for (int i = 0; i < 1000; i++){
//            System.out.println("main " + i);
//            if (i==900) {
//                testThreadStop.stopThread();
//                System.out.println("线程该停止了" + Thread.currentThread().getName());
//            }
//        }
    }

}
