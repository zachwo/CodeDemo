package com.oracle.task2;

/**
 * 2.编写一个多线程的程序，用来模拟同时下载多个任务，并显示出下载百分比。如果100%，则线程结束。
 */
public class MyThread implements Runnable{
    private double rate = 0.0;

    @Override
    public void run() {
        while(rate<100.0){
            try {
                Thread.sleep((int)(Math.random()*2000+1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rate+=Math.random();
            //利用字符串方便截取小数点后两位
            String s = rate+"";
            s = s.substring(0,s.indexOf(".")+2);
            //再将字符串转换为double类型
            rate = Double.parseDouble(s);
            if (rate<=100.0){
                System.out.println(Thread.currentThread().getName()+" 下载进度："+rate+"%");
            }else{
                System.out.println(Thread.currentThread().getName()+" 下载进度：100.0%");
            }
        }
    }
}
