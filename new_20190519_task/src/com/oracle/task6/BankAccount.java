package com.oracle.task6;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "姓名："+this.getName()+"，\t账户余额："+this.getBalance();
    }
}
