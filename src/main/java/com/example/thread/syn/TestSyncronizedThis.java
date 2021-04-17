package com.example.thread.syn;

/**
 * 锁住当前对象
 * 关于this 的
 */
public class TestSyncronizedThis implements Runnable {
    private Integer y = 0;

    private void setNumber(){
        y++;
    }
    private int getNumber(){
        return y;
    }

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i <= 5 ; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setNumber();
                System.out.println(Thread.currentThread().getName() + " : " + i + "  --->>>" + getNumber());
            }
        }
    }
}

class TestDemo extends Thread {
    TestDemo(Runnable runnable, String name) {
        super(runnable, name);
    }

    public static void main(String[] args) {
        TestSyncronizedThis testDemoSynchronizedfor = new TestSyncronizedThis();
        for (int i = 1; i <= 3; i++) {
            TestDemo testDemofor = new TestDemo(testDemoSynchronizedfor, "Thread" + i);
            testDemofor.start();
        }

    }
}