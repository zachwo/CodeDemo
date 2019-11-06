package com.oracle.task2;

public class Employee {
    private String number;
    private String name;
    private double basicSalary;
    private double increaseRate;

    public Employee() {
    }

    public Employee(String number, String name, double basicSalary, double increaseRate) {
        this.number = number;
        this.name = name;
        this.basicSalary = basicSalary;
        this.increaseRate = increaseRate;
    }

    public double getIncreasedSalary(){
        return this.basicSalary*this.increaseRate;
    }

    public double getTotalSalary(){
        return getIncreasedSalary()+basicSalary;
    }
}
