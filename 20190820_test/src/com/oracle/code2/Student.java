package com.oracle.code2;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);//调用父类构造块
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void doSomething() {
        System.out.println(super.getName()+"在"+this.school+"学习");
    }
}
