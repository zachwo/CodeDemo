package com.oracle.task3;

public class Test {
    /**
     * 为什么多线程的运行速度反而比单线程的速度要慢？？？
     * @param args
     */
    public static void main(String[] args) {
        MyThread m1 = new MyThread(1,1000);
        MyThread m2 = new MyThread(1001,2000);
        MyThread m3 = new MyThread(2001,3000);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive()||t2.isAlive()||t3.isAlive()){

        }
        long endTime = System.currentTimeMillis();

        System.out.println("所有素数的总数是："+MyThread.sum);
        System.out.println("程序运行时间为："+(endTime-startTime)+"毫秒");
    }
}
