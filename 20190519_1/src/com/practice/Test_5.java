package com.practice;

import com.practice.entity.Employee_5;

public class Test_5 {
    public static void main(String[] args) {
        Employee_5 emp1 = new Employee_5();
        Employee_5 emp2 = new Employee_5("001");
        Employee_5 emp3 = new Employee_5("002","张三");
        Employee_5 emp4 = new Employee_5("003","李四",15000,"研发部");
        emp1.outputInfo();
        emp2.outputInfo();
        emp3.outputInfo();
        emp4.outputInfo();
    }
}
