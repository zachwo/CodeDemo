package com.oracle.task5;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("001");
        Employee e3 = new Employee("002","张三");
        Employee e4 = new Employee("003","李四",1500,"前端");

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
        e4.printInfo();


    }
}
