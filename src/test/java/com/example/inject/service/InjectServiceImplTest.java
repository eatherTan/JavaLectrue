package com.example.inject.service;

import com.example.inject.UnitTestBase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(BlockJUnit4ClassRunner.class)
class InjectServiceImplTest  {


    @Test
    public void hello() {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("classpath*:spring-ioc.xml");
        InjectService obj = (InjectService) context.getBean("injectService");
        System.out.println(obj.hello("13"));

    }
}