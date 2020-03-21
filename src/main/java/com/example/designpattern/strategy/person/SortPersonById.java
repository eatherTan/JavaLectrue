package com.example.designpattern.strategy.person;

import java.util.Comparator;

public class SortPersonById implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return o1.getId() - o2.getId();
    }

    @Override
    public Comparator<Person> reversed() {
        return this::compare;
    }
}
