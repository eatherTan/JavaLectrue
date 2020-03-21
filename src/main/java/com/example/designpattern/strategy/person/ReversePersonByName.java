package com.example.designpattern.strategy.person;

import java.util.Comparator;

public class ReversePersonByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name2.compareTo(name1);
    }
}
