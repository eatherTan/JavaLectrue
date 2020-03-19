package com.example.inject.service;

import com.example.inject.dao.InjectDao;

public class InjectServiceImpl implements InjectService{

    private InjectDao injectDao;

    public void setInjectDao(InjectDao injectDao) {
        this.injectDao = injectDao;
    }

    @Override
    public String hello(String word) {

        return "hello world " + word + "save success: " + injectDao.save();
    }
}
