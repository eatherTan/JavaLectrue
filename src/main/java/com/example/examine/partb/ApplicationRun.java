package com.example.examine.partb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRun {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        run();
    }

    public static void run() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        //执行
        Class<?> classType = MethodAboutTest.class;
        Method[] methods = classType.getMethods();  //获取public 修饰符修饰的方法
        List<Method> methodExcutedList = new ArrayList<>();   //找出符合条件的Method 方法：被Test注解修饰，public void 且不带参数
        for (Method method : methods){
            if (method.getAnnotation(Test.class) != null){  //方法是否被Test.class 修饰，如果是不为空
                Type voidType = method.getReturnType();
                if (voidType.getTypeName().equals("void")){ //返回类型为void
                    if (method.getParameterCount() == 0) {  //参数个数为0
                        methodExcutedList.add(method);      //把符合条件的method 放入要执行的方法列表中
                    }
                }
            }
        }
        for (Method method : methodExcutedList){
            Object testInstance = classType.newInstance();
            Object result = method.invoke(testInstance,new Class[]{});
        }
    }
}
