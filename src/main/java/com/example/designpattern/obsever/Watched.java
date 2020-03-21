package com.example.designpattern.obsever;

//抽象主题角色：被观察者

public interface Watched {

    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyWathcer(String str);

}
