package com.example.thread.waitnotify.one2one;

public class Thread2 extends Thread{

    Consumer consumer;

    public Thread2(Consumer consumer){
        super();
        this.consumer = consumer;
    }

    @Override
    public void run(){
        consumer.consume();
    }
}
