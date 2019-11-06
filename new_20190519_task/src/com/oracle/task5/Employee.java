package com.oracle.task5;

public class Employee {
    private String number;
    private String name;
    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(String number) {
        this.number = number;
        this.name = "无名氏";
        this.salary = 0;
        this.department = "未定";
    }

    public Employee(String number, String name) {
        this.number = number;
        this.name = name;
        this.salary = 1000;
        this.department = "后勤";
    }

    public Employee(String number, String name, double salary, String department) {
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo() {
        System.out.println("姓名："+this.getName()+",\t工号："+this.getNumber()+",\t薪水："+this.getSalary()+",\t部门："+this.getDepartment());
    }
}
