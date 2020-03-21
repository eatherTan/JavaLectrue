package com.example.designpattern.strategy.person;

import java.util.ArrayList;
import java.util.List;

public class PersonClient {

    public static void main(String[] args) {
        SortPersonByIdStrategy idStrategy =  new SortPersonByIdStrategy();
        PersonEnviroment personEnviroment = new PersonEnviroment(idStrategy);
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(1,"tan",12);
        Person person2 = new Person(3,"xiao",11);
        Person person3 = new Person(2,"lian",16);
        Person person4 = new Person(5,"lian",18);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        personEnviroment.sortPeron(idStrategy,personList);
        for (Person p : personList){
            System.out.println(p.getId()  + " " + p.getName());
        }

        System.out.println("\n  ------------------");
//        ReversePersonByIdStrategy reversePersonByIdStrategy = new ReversePersonByIdStrategy();
        personEnviroment.reversePerson(idStrategy,personList);
        for (Person p : personList){
            System.out.println(p.getId()  + " " + p.getName());
        }
    }

}
