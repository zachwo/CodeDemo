package com.oracle.task2;

public class Test {
    public static void main(String[] args) {
        MyThread m0 = new MyThread();
        MyThread m1 = new MyThread();

        Thread t0 = new Thread(m0);
        Thread t1 = new Thread(m1,"蜘蛛侠");

        t0.setName("阿丽塔");


        t0.start();
        t1.start();
    }
}
