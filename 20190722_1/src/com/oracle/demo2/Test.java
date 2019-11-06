package com.oracle.demo2;

/**
 * 死锁测试
 */
public class Test {
    public static void main(String[] args) {
        ZhangSan zs = new ZhangSan();
        LiSi ls = new LiSi();

        MyThread m1 = new MyThread(zs,ls);
        m1.flag = true;
        Thread t1 = new Thread(m1);

        MyThread m2 = new MyThread(zs,ls);
        m2.flag = false;
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

    }
}
