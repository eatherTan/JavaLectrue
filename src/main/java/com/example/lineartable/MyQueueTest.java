package com.example.lineartable;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);

        System.out.println(queue.isFull());
        System.out.println(queue.getQueue());
        queue.headQueue();
        System.out.println(queue.isFull());  //这里有一个问题：已经取出了一个数据，但是队列还是满的，队列只能使用一次；待优化：环形队列
        queue.showQueue();
    }
}
