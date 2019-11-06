package com.practice;

import com.practice.entity.Account;

public class Test_6{
    public static void main(String[] args) {
        Account acc = new Account("张三",9500);
        System.out.println(acc.getName()+"的账户余额为"+acc.getBalance()+"元。");
    }
}
