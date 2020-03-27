package com.example.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaMethodTest {
    public static void main(String args[]){

        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        LamdaMethodTest tester2 = new LamdaMethodTest();
        tester2.sortUsingJava7(names1);
        System.out.println(names1);
    }

    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });
    }

    /**
     * lamda 表达式排序
     * @param names
     */
    private void sortUsingJava8(List<String> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
