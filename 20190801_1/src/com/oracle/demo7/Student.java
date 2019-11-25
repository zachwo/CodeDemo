package com.oracle.demo7;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private ClassNum classNum;
    private List<Teacher> teachers;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        teachers = new ArrayList<>();
    }

    public Student() {
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ClassNum getClassNum() {
        return classNum;
    }

    public void setClassNum(ClassNum classNum) {
        this.classNum = classNum;
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
    public String toString() {
        return this.getName()+","+this.getAge()+"岁";
    }
}
