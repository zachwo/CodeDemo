package com.oracle.StudentManagementSystem;

public class Student {
    private String number;
    private String name;
    private String sClass;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String number, String name, String sClass, String sex, int age) {
        this.number = number;
        this.name = name;
        this.sClass = sClass;
        this.sex = sex;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学号："+this.getNumber()+"\t姓名："+this.getName()+"\t班级："+this.getsClass()+"\t性别："
                +this.getSex()+"\t年龄："+this.getAge();
    }
}
