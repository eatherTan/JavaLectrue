package com.example.thread.waitnotify.many2one;

import java.util.Stack;

public class Consumer {

    Stack<Integer> stack;

    //构造注入
    public Consumer(Stack<Integer> stack){
        this.stack = stack;
    }

    //消费消息
    public void consume(){
        while (true){
            synchronized (stack){
                if (stack.size() != 0){
                    Integer temp = stack.pop();//出栈
                    System.out.println(Thread.currentThread().getName() +  " consume one product" + temp + ",stack.size = " + stack.size());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stack.notify();//wake up producer
                }
            }
        }
    }
}
