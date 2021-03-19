package com.example.thread.syn;

public class VolatileDemo {
    int a = 1;
    int b = 2;

    public void change(){
        a = 3; //改变他们的值
        b = 4;
    }

    public void print(String threadName){
        System.out.println(threadName + "---" + "a = " + a+" ; b = " + b);
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                volatileDemo.change();
                volatileDemo.print(Thread.currentThread().getName());
            }
        }).start();
    }
}
