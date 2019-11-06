package com.oracle.demo;

public class MyThread extends Thread{
    private int temp=0;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    /**
     * 重写run方法
     */
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(name+":"+temp);
            temp++;
        }
    }
}
