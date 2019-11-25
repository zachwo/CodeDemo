package com.practice.entity;

public class Employee_5 {
    private String number;
    private String name;
    private int salary;
    private String department;

    public Employee_5() {
    }

    public Employee_5(String number) {
        this.number = number;
        this.name = "无名氏";
        this.salary = 0;
        this.department = "未定";
    }

    public Employee_5(String number, String name) {
        this.number = number;
        this.name = name;
        this.salary = 1000;
        this.department = "后勤";
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee_5(String number, String name, int salary, String department) {
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void outputInfo(){
        System.out.println("员工号："+this.getNumber()+"\t姓名："+this.getName()+"\t薪水："
                +this.getSalary()+"\t部门："+this.getDepartment());
    }

}
