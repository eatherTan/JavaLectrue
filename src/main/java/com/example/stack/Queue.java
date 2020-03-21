package com.example.stack;

public interface Queue {

    void put(Object o);

    Object remove();

    Object get();

    boolean isEmpty();
}
