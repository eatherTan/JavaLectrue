package com.example.thread;

/**
 * 不共享数据的情况
 */
public class ThreadDontShare extends Thread{

    private int count = 5;
    public ThreadDontShare(String name ){
        super();
        this.setName(name);
    }


    @Override
    public void run(){
        super.run();       //为什么要super.run()
        while (count > 0){
            count--;
            System.out.println(" 由" + this.getName() + "计算，count = "+ count) ;
            try {
                Thread.sleep(300);  //哪条线程执行到了，哪条线程就会睡眠，并不需要指定线程: a.sleep()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDontShare dontShare1 = new ThreadDontShare("A");
        ThreadDontShare dontShare2 = new ThreadDontShare("B");
        ThreadDontShare dontShare3 = new ThreadDontShare("C");
        dontShare1.start();
        dontShare2.start();
        dontShare3.start();
    }
}
