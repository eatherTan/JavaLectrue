package com.example.designpattern.obsever.impl;

import com.example.designpattern.obsever.Watched;
import com.example.designpattern.obsever.Watcher;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatchedImpl implements Watched {

    private List<Watcher> watcherList = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWathcer(String str) {
        for (Watcher wat : watcherList){
            wat.update(str);
        }
    }
}
