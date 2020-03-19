package com.example.annotation;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyAnnotationUsage {
    @Deprecated
    @MyAnnotation(hello = "beijing", world = "shanghai")
    public void output(){
        System.out.println("output something");
    }
}
