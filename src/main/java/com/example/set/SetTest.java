package com.example.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class SetTest {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        Student a = new Student("tan",100);
        Student b = new Student("xaio",20);
        Student c = new Student("lian",30);
        set.add(a);
        set.add(b);
        set.add(c);
//        System.out.println(set);
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().name);
        }
    }


}

class Student{
    String name;
    int score;

    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}