package com.example.inject;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

    private FileSystemXmlApplicationContext context;

    private String springXmlpath;

    public UnitTestBase(){}

    public UnitTestBase(String springXmlpath) {
        this.springXmlpath = springXmlpath;
    }

    @Before
    public void before(){
        if (StringUtils.isEmpty(springXmlpath)){
            springXmlpath = "classpath:spring-*_xml";
        }
        try{
            context = new FileSystemXmlApplicationContext(springXmlpath);
            context.start();
        }catch (BeansException e){
            e.printStackTrace();
        }
    }
    @After
    public void after(){
        context.destroy();
    }

//    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId){
        return (T) context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }
}
