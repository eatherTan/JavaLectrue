package com.example.thread.waitnotify.many2one;


/**
 * 消费者线程
 */
public class ThreadTwo extends Thread{

    Consumer consumer;

    public ThreadTwo(Consumer consumer){
        super();
        this.consumer = consumer;
    }

    @Override
    public void run(){
        consumer.consume();
    }
}
