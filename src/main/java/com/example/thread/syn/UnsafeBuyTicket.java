package com.example.thread.syn;

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"苦逼的我").start();
        new Thread(station,"牛逼的你们").start();
        new Thread(station,"黄牛党").start();
    }
}

class BuyTicket implements Runnable{

    //票的数量
    private int ticketNums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag){

            buy();
        }
    }

    private synchronized void buy(){  //synchronized： 加了关键字以后，从线程不安全变成安全了。
        //判断是否有票
        if (ticketNums <= 0){
            flag = false;
            return;
        }
        //模拟延迟
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //买票
        ticketNums = ticketNums-1;
        System.out.println(Thread.currentThread().getName() + "拿到票了，剩余" + ticketNums);
    }
}
