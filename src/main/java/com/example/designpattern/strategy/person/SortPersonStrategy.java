package com.example.designpattern.strategy.person;

import java.util.List;

public interface SortPersonStrategy {

    void sortPerson(List<Person> person);

    void reversePerson(List<Person> person);
}
