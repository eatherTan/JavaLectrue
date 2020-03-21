package com.example.designpattern.strategy.person;

import java.util.Comparator;

public class SortPersonByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        if (name1.equals(name2)){
            return o1.getId() - o2.getId();
        }
        return name1.compareTo(name2);
    }
}
