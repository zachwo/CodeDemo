package com.example.entity;

public class Phone implements USB {
    @Override
    public void connection() {
        System.out.println("Phone开始加载驱动");
        System.out.println("Phone加载驱动成功，已连接");
    }

    @Override
    public void transfor() {
        System.out.println("Phone开始传输数据");
        System.out.println("数据传输中....");
        System.out.println("数据传输完毕");
    }

    @Override
    public void close() {
        System.out.println("Phone关闭连接");
    }
}
