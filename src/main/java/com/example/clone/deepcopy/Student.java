package com.example.clone.deepcopy;

public class Student implements Cloneable{
    //引用类型
    private Subject subject;
    //基础数据类型
    private String name;

    private int age;

    public Student() {
    }

    public Student(Subject subject, String name, int age) {
        this.subject = subject;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone(){
        //深拷贝：在clone()方法中，重写构造函数，从而实现深拷贝
        try{
            Student student =(Student) super.clone();
            student.subject  = (Subject)subject.clone();
            return student;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
    @Override
    public String toString() {
        return "[Student: " + this.hashCode() + ",subject:" + subject + ",name:" + name + ",age:" + age + "]";
    }
}
