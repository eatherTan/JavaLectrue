package com.example.thread.waitnotify.one2one;

import java.util.Stack;

//Client类【用于main函数测试】
public class Client {

    /**
     * 单消费者,单生产者
     * @param args
     */
    public static void main(String[] args) {
        //生成或消费的记录都放在stack中
        Stack<Double> stack = new Stack<>();

        Producer producer = new Producer(stack);
        Thread1 thread1 = new Thread1(producer);

        Consumer consumer = new Consumer(stack);
        Thread2 thread2 = new Thread2(consumer);

        thread1.start();  //暂停线程
        thread2.start();  //唤醒线程

        //消息生成和消费成功，等待通知机制
        /*consume one product5.847016952848594,stack.size = 0
        produce one product, the stack size:1
        consume one product3.57657480391548,stack.size = 0
        produce one product, the stack size:1
        consume one product5.780965458948506,stack.size = 0
        produce one product, the stack size:1
        consume one product7.981834787945306,stack.size = 0
        produce one product, the stack size:1
*/
    }
}
