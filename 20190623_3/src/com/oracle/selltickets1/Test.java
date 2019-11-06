package com.oracle.selltickets1;

public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();
        m.setName("A窗口");
        m1.setName("B窗口");
        m2.setName("C窗口");
        m3.setName("D窗口");
        m.start();
        m1.start();
        m2.start();
        m3.start();

    }
}
