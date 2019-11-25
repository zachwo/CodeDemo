package com.exmple.entity;

public class Student extends Person{
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void work(){
        System.out.println("学生的工作是学习");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    //父类Person实现接口需要子类Student进行Override重写
    @Override
    public void fun() {
        System.out.println("Student-->fun");
    }

    @Override
    public void fun1() {
        System.out.println("Student-->fun1");
    }
}
