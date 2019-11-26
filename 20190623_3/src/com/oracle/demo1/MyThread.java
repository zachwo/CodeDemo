package com.oracle.demo1;

/**
 * 实现线程的第二种方法：实现runnable接口，重写run方法（推荐）
 */
public class MyThread implements Runnable{

    private int temp;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<20;i++){
            System.out.println(name+": "+temp);
            temp++;
        }
    }
}
