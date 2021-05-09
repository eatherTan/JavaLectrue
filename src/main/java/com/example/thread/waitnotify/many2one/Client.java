package com.example.thread.waitnotify.many2one;


import java.util.Stack;

//Client类【用于main函数测试】
public class Client {

    /**
     * 单个消费者,多个生产者
     * @param args
     */
    public static void main(String[] args) {
        //生成或消费的记录都放在stack中
        Stack<Integer> stack = new Stack<>();

        //多个消费者
        Producer producer = new Producer(stack);
        ThreadOne thread1 = new ThreadOne(producer);
        ThreadOne thread11 = new ThreadOne(producer);
        thread1.setName("producer1");
        thread11.setName("producer11");

        //一个生产者
        Consumer consumer = new Consumer(stack);
        ThreadTwo thread2 = new ThreadTwo(consumer);
        thread2.setName("consumer1");

        thread1.start();  //暂停线程
        thread11.start();  //暂停线程
        thread2.start();  //唤醒线程

        //运行结果：有时产品栈stack中有1个产品【消费者会消费1次】，有时有2个产品【接下来消费者会消费两次】。
        /*producer1 produce one product, the stack size:1
        producer11 produce one product, the stack size:2
        consumer1 consume one product0,stack.size = 1
        consumer1 consume one product0,stack.size = 0
        producer11 produce one product, the stack size:1
        consumer1 consume one product0,stack.size = 0*/
    }
}
