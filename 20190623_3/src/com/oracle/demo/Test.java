package com.oracle.demo;

public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread("A");
        MyThread m1 = new MyThread("B");
        m.start();
        m1.start();
    }
}
