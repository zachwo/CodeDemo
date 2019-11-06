package com.oracle.demo3;

import java.util.PrimitiveIterator;

public class MyThreadProvider implements Runnable {
    private Info info;
    private boolean flag;

    public MyThreadProvider(Info info) {
        this.info = info;
        this.flag = true;
    }

    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            if(flag){
                info.setInfo("java","真难学");
                flag = false;
            }else{
                info.setInfo("Android","更难学");
                flag = true;
            }
        }
    }
}
