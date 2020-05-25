package com.example.clone.shallowcopy;

public class Student implements Cloneable {
    //引用类型
    private Subject subject;
    //基础数据类型
    private String name;
    private Integer age;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + subject.hashCode() +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
