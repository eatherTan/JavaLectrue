package com.example.thread.waitnotify.many2one;

/**
 * 生产者线程
 */
public class ThreadOne extends Thread{

    Producer producer;

    public ThreadOne(Producer producer){
        super();
        this.producer = producer;
    }

    @Override
    public void run(){
        producer.produce();
    }
}
