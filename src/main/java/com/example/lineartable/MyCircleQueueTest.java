package com.example.lineartable;

public class MyCircleQueueTest {
    public static void main(String[] args) {
        //这里设置大小为4，但是有效数据最大是3个
        MyCircleQueue queue = new MyCircleQueue(4);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);

        System.out.println(queue.isFull());
        System.out.println(queue.getQueue());

        System.out.println(queue.isFull());  
        queue.showQueue();

        queue.headQueue();
        System.out.println();
        queue.showQueue();
        queue.addQueue(3);
        System.out.println();
        queue.showQueue();
    }
}
