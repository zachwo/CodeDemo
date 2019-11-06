package com.oracle.task3;

public class MyThread implements Runnable{
    private int start;
    private int end;
    public static int sum =0;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start;i<=end;i++){
            if(i!=1){
                boolean flag = true;
                for(int j=2;j<=(int)Math.sqrt(i);j++){
                    if(i%j==0){
                        flag = false;
                        break;

                    }
                }
                if(flag){
                    System.out.println(i);
                    sum++ ;
                }
            }
        }
    }
}

