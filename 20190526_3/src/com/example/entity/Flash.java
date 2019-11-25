package com.example.entity;

public class Flash implements USB {
    @Override
    public void connection() {
        System.out.println("Flash开始加载驱动");
        System.out.println("Flash加载驱动成功，已连接");
    }

    @Override
    public void transfor() {
        System.out.println("Flash开始传输数据");
        System.out.println("数据传输中....");
        System.out.println("数据传输完毕");
    }

    @Override
    public void close() {
        System.out.println("Flash关闭连接");
    }
}
