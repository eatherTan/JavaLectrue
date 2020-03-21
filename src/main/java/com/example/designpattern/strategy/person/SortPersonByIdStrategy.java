package com.example.designpattern.strategy.person;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortPersonByIdStrategy implements SortPersonStrategy {
    @Override
    public void sortPerson(List<Person> person) {
        Collection collection = person;
        Collections.sort(person,new SortPersonById());

    }
//
//    @Override
    public void reversePerson(List<Person> person) {
        Collection collection = person;
        Collections.sort(person,new ReversePersonById());
    }

}
