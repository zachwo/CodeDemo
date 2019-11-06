package com.oracle.selltickets2;

public class MyThread implements Runnable {
    private int ticket = 100;

    @Override
    public void run(){
        for(int i=0; i<200; i++){
            if(ticket>0){
                //一个线程相当于一个售票窗口
//                System.out.println("***"+Thread.currentThread().getName()+"***");
                System.out.println(Thread.currentThread().getName()+"售票,余票："+(--ticket));
//                System.out.println();

//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    System.out.println("线程被打断");
//                }
            }
        }
    }
}

