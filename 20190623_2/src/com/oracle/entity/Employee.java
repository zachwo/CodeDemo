package com.oracle.entity;

public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String cardNo;

    public static int empNum;
    public static int salNum;
    public static final int lowSal = 2000;

    public Employee(String id, String name, int age) throws MyException{
        this.id = id;

        if(age<18){
            throw new MyException("年龄低异常");
        }else if(age>60){
            throw new MyException("年龄高异常");
        }else{
            this.age = age;
        }
        if(name==null||name.trim().equals("")){
            throw new MyException("姓名为空异常");
        }else{
            this.name = name;
        }

    }

    public Employee(double salary, String cardNo) throws MyException {
        this.cardNo = cardNo;

        if(salary<600){
            throw new MyException("工资低异常");
        }else{
            this.salary = salary;
        }

    }

    public void addSalary(double addSalary) throws MyException{
        this.salary += addSalary;
        if(salary>salNum){
            throw new MyException("工资高异常");
        }
    }

    public void minusSalary(double minusSalary) throws MyException{
        this.salary -= minusSalary;
        if(salary<lowSal){
            throw new MyException("工资低异常");
        }
    }

    public void showTotalSalary() throws MyException{
        if(salNum<=0){
            throw new MyException("空异常");
        }else{
            System.out.println(salNum);
        }
    }

    public void showTotalEmployee() throws MyException{
        if(empNum<=0){
            throw new MyException("员工空异常");
        }else{
            System.out.println(empNum);
        }
    }

}

