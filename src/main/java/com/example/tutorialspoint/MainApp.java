package com.example.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spell.xml");
        TextEditor obj = (TextEditor) context.getBean("textEditor");
        obj.spellCheck();

        String a = new String("123");
        String b = new String("123");
        System.out.println(a.equals(b));

    }
}
