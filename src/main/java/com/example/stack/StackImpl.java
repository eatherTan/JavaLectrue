package com.example.stack;

import java.util.LinkedList;

public class StackImpl implements Stack{
//这里要不要用new 呢， 这里要用一个变量存储栈或队列中的元素
    private LinkedList obj = new LinkedList();

    public StackImpl() {
    }

    public StackImpl(LinkedList obj) {
        this.obj = obj;
    }

    /**
     * 压栈  压入元素
     * @param o
     */
    @Override
    public void push(Object o) {
        obj.addLast(o);
    }

    /**
     * 弹出元素
     * @return
     */
    @Override
    public Object pop() {

        Object temp = obj.removeLast();
        return temp;
    }

    @Override
    public Object peek() {
        return obj.peekLast();
    }

    @Override
    public boolean isEmpty() {
        return obj.isEmpty();
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push("1");
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
