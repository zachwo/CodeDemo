package com.oracle.task3;

/**
 * 3、利用多线程求解某范围素数,每个线程负责 1000范围：线程1找1-1000；线
 * 程 2 找 1001-2000；线程 3 找 2001-3000。编程程序将每个线程找到的素数及时
 * 打印。所有的素数输出完毕后，再输出素数的总数；
 */
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

