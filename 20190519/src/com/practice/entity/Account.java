package com.practice.entity;

public class Account {
    private String name;
    private int balance;

    public Account() {
    }

    public Account(String name, int remainSum) {
        this.name = name;
        this.balance = remainSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
