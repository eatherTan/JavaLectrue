package com.example.annotation;

//属于标识性的注解
public @interface AnnotationTest {
    String value1();
    //如果是value，则是默认的值，在使用时可以不执行名称
    //不是value，那么在使用时，就需要指定名称
}
