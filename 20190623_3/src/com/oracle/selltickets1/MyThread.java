package com.oracle.selltickets1;

public class MyThread extends Thread {
    private int ticket = 100;

    public void run(){
        for(int i=0; i<200; i++){
            if(ticket>0){
                //一个线程相当于一个售票窗口
                System.out.println(Thread.currentThread().getName()+"售票,余票："+(--ticket));

            }
        }
    }
}
