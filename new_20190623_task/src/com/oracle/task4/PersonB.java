package com.oracle.task4;

public class PersonB implements Runnable {
    private ATM atm;

    public PersonB(ATM atm) {
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
        try {
            this.atm.withdraw(50);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额："+this.atm.getAccount().getBalance());

    }
}
