package com.oracle.demo1;

public class  MyThread implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
//             //同步块
//             synchronized (this){
//                 if(tickets>0){
//                     System.out.println(Thread.currentThread().getName()+"售票，余票："+(--tickets));
//                 }
//             }
            this.sellTicket();//等价于synchronized(this)

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //同步方法
    public synchronized void sellTicket(){
        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+"售票，余票："+(--tickets));
        }
    }
}
