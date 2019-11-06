package com.oracle.demo3;

public class MyThreadCustomer implements Runnable {
    private Info info;

    public MyThreadCustomer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            info.getInfo();
        }
    }

}
