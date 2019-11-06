package com.oracle.task4;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(200);
        ATM atm = new ATM(account);
        PersonA a = new PersonA(atm);
        PersonB b = new PersonB(atm);

        Thread ta = new Thread(a);
        Thread tb = new Thread(b);

        ta.start();
        try {
            ta.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tb.start();
        try {
            tb.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
