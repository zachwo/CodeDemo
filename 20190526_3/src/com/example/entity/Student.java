package com.example.entity;

public class Student extends Person implements Info{

    public Student(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(this.getName()+"吃");
    }

    @Override
    public void fun() {
        System.out.println("Student-->fun");
    }
}
