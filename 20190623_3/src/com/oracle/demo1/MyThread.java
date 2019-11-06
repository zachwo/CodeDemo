package com.oracle.demo1;

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
