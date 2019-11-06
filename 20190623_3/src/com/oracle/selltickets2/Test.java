package com.oracle.selltickets2;

public class Test {
    public static void main(String[] args) {
        //*************************//
        MyThread m = new MyThread();
        //四个线程操作同一个对象m来共享资源
        Thread t = new Thread(m);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        //*************************//

        t.setName("窗口A");
        t1.setName("窗口B");
        t2.setName("窗口C");
        t3.setName("窗口D");
        //主线程调用主方法
        System.out.println("###"+Thread.currentThread().getName()+"###");//main
//        System.out.println("t线程是否启动："+t.isAlive());
        t.setDaemon(true);//设置为后台线程

        t.start();
//        System.out.println("t线程是否启动："+t.isAlive());
//        t1.start();
//        t2.start();
//        t3.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
//            if(i==3){
//                try {
//                    t.join();//强制执行线程t直至线程t结束，期间其它线程不能运行
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

//            if(i==3){
//                t.interrupt();
//            }
        }


    }
}
