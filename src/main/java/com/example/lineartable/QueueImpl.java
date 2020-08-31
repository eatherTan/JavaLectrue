package com.example.lineartable;

import java.util.LinkedList;

public class QueueImpl implements Queue {

    private LinkedList link;

    /**
     * 插入元素到队列中
     * @param o
     */
    @Override
    public void put(Object o) {
        link.addLast(o);
    }

    /**
     * 删除队列的元素
     * @return
     */
    @Override
    public Object remove() {
        return link.removeFirst();
    }

    /**
     * 获取队列的元素
     * @return
     */
    @Override
    public Object get() {
        return link.getFirst();
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return  link.isEmpty();
    }
}
