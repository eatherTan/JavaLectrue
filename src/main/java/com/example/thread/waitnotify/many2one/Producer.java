package com.example.thread.waitnotify.many2one;

import java.util.Stack;

public class Producer {

    Stack<Integer> stack;

    //构造注入：this.stack = stack
    public Producer(Stack<Integer> stack){
        this.stack = stack;
    }

    public void produce(){
        while (true){
            if (this.stack.size() == 0){
                synchronized (stack){
                    Integer product = (int)Math.random() * 10;
                    stack.push(product);
                    System.out.println(Thread.currentThread().getName() + " produce one product, the stack size:" + stack.size());
                    try {
                        stack.wait();//阻塞
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
