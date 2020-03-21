package com.example.string;

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Object str){
        if (this == str){
            return true;
        }
        if (str instanceof Student){
            Student anStr = (Student) str;
            if (this.name.equals(anStr.name)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
