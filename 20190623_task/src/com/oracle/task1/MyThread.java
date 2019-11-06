package com.oracle.task1;

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
