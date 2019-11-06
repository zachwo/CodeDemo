package com.oracle.task2;


public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("101","张三",2000,0.15);
        System.out.println("增长工资："+employee.getIncreasedSalary());
        System.out.println("总工资："+employee.getTotalSalary());
    }
}
