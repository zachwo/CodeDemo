package com.oracle.task6;

public class Test {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("张三");
        BankAccount a2 = new BankAccount("李四",15000);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        a1.setBalance(5000);
        System.out.println(a1.toString());
    }
}
