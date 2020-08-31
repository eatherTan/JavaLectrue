package com.example.lineartable;

/**
 * 使用数组实现队列
 */
public class MyCircleQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public MyCircleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0; //指向队列头部的第一个数据
        rear = 0;  //rear 变量含义做了调整：rear指向队列最后一个元素的后一个位置，因为希望空出一个位置
    }
    //判断队列是否已满
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
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
        //1.直接将元素加入；2.然后将rear后移,这里必须考虑取模
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }
    //取出队列的所有数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的！");
        }
        return arr[front];
    }
    //求出当前队列有效元素的个数
    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    //展示队列信息
    public void showQueue(){
        if (isEmpty()){
            System.out.println("对列是空的！");
            return;
        }

        //遍历多少个元素
        for (int i = front; i<front+size(); i++){
            System.out.printf("arr[%d]%d\t",i % maxSize,arr[i % maxSize]);
        }
    }
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        //这里需要分析出：front是指向队列的第一个元素
        //1.先把front对应的值保存到临时变量
        //2.将front后移,后移时考虑取模
        //3.将临时保存的变量返回
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }
}
