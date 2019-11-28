package com.oracle.task1;

/**
 * 1.编写一个多线程的程序，模拟火车站卖票系统。共有4个窗口，同时卖出100张火车票
 */
public class MyThread implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
                 if(tickets>0){
                     System.out.println(Thread.currentThread().getName()+"售票，余票："+(--tickets));
                 }
        }
    }

}
