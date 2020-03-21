package com.example.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    private static final Comparator<Student> StudentComparator =  new StudentComparator();

    public static void main(String[] args) {

        TreeSet<Student> tree = new TreeSet<Student>(StudentComparator);

        Student stu1 = new Student("tan",100);
        Student stu2 = new Student("tan",500);
        Student stu3 = new Student("tan",300);

        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);

        System.out.println(tree);
        for(Student stu : tree){
            System.out.println(stu.score);
        }
    }
}

