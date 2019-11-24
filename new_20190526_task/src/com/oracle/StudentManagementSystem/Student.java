package com.oracle.StudentManagementSystem;

public class Student {
    private String stuNum;
    private String stuName;
    private String stuClass;
    private String stuSex;
    private int stuAge;

    public Student(String stuNum) {
        this.stuNum = stuNum;
    }

    public Student(String stuNum, String stuName, String stuClass, String stuSex, int age) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuSex = stuSex;
        this.stuAge = age;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
            this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "学号："+this.getStuNum()+"\t姓名:"+this.getStuName()+
                "\t班级："+this.getStuClass()+"\t性别："+this.getStuSex()+
                "\t年龄："+this.getStuAge();
    }
}
