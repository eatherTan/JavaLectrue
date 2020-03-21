package com.example.designpattern.strategy.person;

import java.util.List;

public class PersonEnviroment {

    private SortPersonStrategy sortPersonStrategy ;

    public PersonEnviroment(SortPersonStrategy sortPersonStrategy) {
        this.sortPersonStrategy = sortPersonStrategy;
    }

    public SortPersonStrategy getSortPersonStrategy() {
        return sortPersonStrategy;
    }

    public void setSortPersonStrategy(SortPersonStrategy sortPersonStrategy) {
        this.sortPersonStrategy = sortPersonStrategy;
    }

    public void sortPeron(SortPersonStrategy sortPersonStrategy, List<Person> personList ){
            sortPersonStrategy.sortPerson(personList);
    }

    public void reversePerson(SortPersonStrategy sortPersonStrategy, List<Person> personList ){
        sortPersonStrategy.reversePerson(personList);
    }
}
