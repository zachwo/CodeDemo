package com.oracle.demo3;

/**
 * 生产者与消费者的问题
 * 生产者生产某一样商品，消费者消费某一样商品
 * 假设生产者生产的商品是一种信息，消费者去读取这个信息
 * 信息有两个部分：信息的标题，信息的内容
 *
 */
public class Test {
    public static void main(String[] args) {
        Info info =new Info();
        MyThreadProvider provider = new MyThreadProvider(info);
        MyThreadCustomer customer =new MyThreadCustomer(info);
        Thread t1 = new Thread(provider);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();
    }
}
