package com.example.lineartable;

/**
 * 使用数组实现队列
 */
public class MyQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1; //指向队列头部的前一个数据
        rear = -1;  //指向队列尾部的最后的一个数据
    }
    //判断队列是否已满
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return front == rear;
    }
    //添加数据到队列中
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    //取出队列的所有数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的！");
        }
        return arr[front+1];
    }
    //展示队列信息
    public void showQueue(){
        if (isEmpty()){
            System.out.println("对列是空的！");
            return;
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf("arr[%d]%d\t",i,arr[i]);
        }
    }
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        front++;
        return arr[front];
    }
}
