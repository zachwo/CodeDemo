package com.oracle.demo1;


public class Test {
    public static void main(String[] args) {
        MyThread m = new MyThread("A");
        MyThread m1= new MyThread("B");

        Thread t = new Thread(m);
        Thread t1 = new Thread(m1);

        t.start();
        t1.start();
    }
}
