package com.example.designpattern.strategy.person;

import java.util.Comparator;

public class ReversePersonById implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return o2.getId() - o1.getId();
    }
}
