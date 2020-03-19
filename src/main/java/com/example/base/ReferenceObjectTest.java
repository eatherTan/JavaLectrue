package com.example.base;

public class ReferenceObjectTest {

    public void changePerson(Person p){
        p = new Person();
        p.age = 10;
        p.name = "eather";
    }

    public static void main(String[] args) {
        Person person = new Person();


    }
}
