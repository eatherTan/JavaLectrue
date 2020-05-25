package com.example.clone.shallowcopy;

//
public class ShallowCopy {
    public static void main(String[] args) {
        Subject subject = new Subject("yuwen");
        Student studentA = new Student();
        studentA.setSubject(subject);
        studentA.setName("Lynn");
        studentA.setAge(20);

        Student studentB = (Student) studentA.clone();
        studentB.setName("Lily");
        studentB.setAge(18);
        Subject subjectB = studentB.getSubject();
        subjectB.setName("lishi");
        System.out.println(studentA.hashCode() + " " + "studentA:" + studentA.toString());
        System.out.println(subjectB.hashCode() + " " + "studentB:" + studentB.toString());
    }
}
