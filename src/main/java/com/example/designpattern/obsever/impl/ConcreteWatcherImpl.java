package com.example.designpattern.obsever.impl;

import com.example.designpattern.obsever.Watcher;

public class ConcreteWatcherImpl implements Watcher {
    /**
     * 实现update方法
     * @param str
     */
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
