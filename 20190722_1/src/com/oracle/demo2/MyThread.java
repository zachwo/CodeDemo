package com.oracle.demo2;

public class MyThread implements Runnable {
    private ZhangSan zs;
    private LiSi ls;
    public boolean flag=true;

    public MyThread(ZhangSan zs, LiSi ls) {
        this.zs = zs;
        this.ls = ls;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (zs){
                zs.speak();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ls){
                    zs.get();
                }
            }
        }else{
            synchronized (ls){
                ls.speak();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs){
                    ls.get();
                }
            }
        }


    }
}
