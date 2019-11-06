package com.oracle.task2;

public class MyThread implements Runnable{
    private int rate = 0;

    @Override
    public void run() {
        while(rate<=100){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"下载进度："+(rate++)+"%");
        }
    }
}
