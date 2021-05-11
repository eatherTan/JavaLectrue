package com.example.thread.waitnotify.one2one;

public class Thread1 extends Thread{

    Producer producer;

    public Thread1(Producer producer){
        super();
        this.producer = producer;
    }

    @Override
    public void run(){
        producer.produce();
    }
}
