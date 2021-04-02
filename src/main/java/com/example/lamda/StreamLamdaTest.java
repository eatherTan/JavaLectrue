package com.example.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLamdaTest {
    public static void main(String[] args) {

        //List的lamda操作
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> list1 = list.stream().filter(s -> s.equals("3")).collect(Collectors.toList());
        System.out.println(list1.get(0));

        List<String> strings = new ArrayList<>();
        strings.add("ta");
        strings.add(" dkj");
        String update = strings.stream().reduce("",String::concat);
        System.out.println(update);
    }
}
