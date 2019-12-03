package com.oracle.task6;

public class Student {
    private String name;
    private int age;
    private int grades;

    public Student(String name, int age, int grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
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

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "姓名："+this.getName()+"  年龄："+this.getAge()+"  成绩："+this.getGrades();
    }
}
