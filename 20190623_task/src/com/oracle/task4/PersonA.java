package com.oracle.task4;

public class PersonA implements Runnable {
    private ATM atm;

    public PersonA(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额："+this.atm.getAccount().getBalance());
        this.atm.saveMoney(100);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额："+this.atm.getAccount().getBalance());

    }
}
