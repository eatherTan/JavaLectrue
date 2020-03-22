package com.example.examine.partb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })  //限制仅方法可以用该注解
@Retention(RetentionPolicy.RUNTIME)   //设置成Runtime，在运行时去动态获取注解信息
public @interface Test {

}
