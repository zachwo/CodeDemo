package com.oracle.demo1;

public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread();

        Thread t0 = new Thread(m);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t0.setName("售票窗口A");
        t1.setName("售票窗口B");
        t2.setName("售票窗口C");
        t3.setName("售票窗口D");


        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

