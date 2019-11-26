package com.oracle.task2;

/**
 * 2.编写一个多线程的程序，用来模拟同时下载多个任务，并显示出下载百分比。如果100%，则线程结束。
 */
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
