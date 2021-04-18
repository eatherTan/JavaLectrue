package com.example.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaComparator {
    public static void main(String[] args) {
        Test one = new Test();
        one.height = 2;
        one.width = 1;
        Test two = new Test();
        two.height = 2;
        two.width = 3;
        Test three = new Test();
        three.height = 1;
        three.width = 1;

        Comparator<Test> comparator = Comparator
                .comparingInt((Test t) -> t.height).reversed()
                .thenComparingInt((Test t ) -> t.width).reversed();

        List<Test> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);

        list.stream()
                .sorted(comparator)
                .forEach(e -> System.out.println(e.height + "/" + e.width));
    }
}

class Test {
    int width;
    int height;
}