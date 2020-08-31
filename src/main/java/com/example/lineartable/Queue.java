package com.example.lineartable;

public interface Queue {

    void put(Object o);

    Object remove();

    Object get();

    boolean isEmpty();
}
