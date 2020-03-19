package com.example.inject;

import com.example.inject.service.InjectService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        InjectService injectService = (InjectService) context.getBean("injectService");
        System.out.println(injectService.hello(" test inject"));
    }
}
