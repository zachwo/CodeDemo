package com.practice;

import com.practice.entity.Employee;

public class Test_2 {
    public static void main(String[] args) {
        Employee employee =new Employee(2490,400);
        System.out.println(employee.increaseRate());
        System.out.println(employee.totalSalary());
    }

}
