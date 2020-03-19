package com.example.annotation;

@AnnotationTest(value1 = "hello")
public class AnnotationUsage {
    @AnnotationTest(value1 = "world")
    public void method(){
        System.out.println("method info");
    }

    public static void main(String[] args) {
        AnnotationUsage usage = new AnnotationUsage();
        usage.method();
    }
}
