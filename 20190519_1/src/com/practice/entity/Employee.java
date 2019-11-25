package com.practice.entity;

import java.text.DecimalFormat;

public class Employee {
    private String number;
    private String name;
    private double basicSalary;
    private double increaseSalary;

    public Employee() {
    }

    public Employee(double basicSalary, double increaseSalary) {
        this.basicSalary = basicSalary;
        this.increaseSalary = increaseSalary;
    }


    public Employee(String number, String name, double basicSalary, double increaseSalary) {
        this.number = number;
        this.name = name;
        this.basicSalary = basicSalary;
        this.increaseSalary = increaseSalary;
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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getIncreaseSalary() {
        return increaseSalary;
    }

    public void setIncreaseSalary(double increaseSalary) {
        this.increaseSalary = increaseSalary;
    }

    public double totalSalary(){
        return basicSalary+increaseSalary;
    }
    public String increaseRate(){
        DecimalFormat df = new DecimalFormat("#####0.0000");
        return df.format(increaseSalary/basicSalary); //*100+"%";
    }
}
