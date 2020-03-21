package com.example.designpattern.obsever;

import com.example.designpattern.obsever.impl.ConcreteWatchedImpl;
import com.example.designpattern.obsever.impl.ConcreteWatcherImpl;

public class TestWatcher {
    public static void main(String[] args) {
        Watched girl = new ConcreteWatchedImpl();
        Watcher watcher1 = new ConcreteWatcherImpl();
        Watcher watcher2 = new ConcreteWatcherImpl();
        Watcher watcher3 = new ConcreteWatcherImpl();

        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWathcer("今天很开心");   //监听器自动执行，主题调用

        girl.removeWatcher(watcher2);
        girl.notifyWathcer("不喜欢watcher2");
    }
}
