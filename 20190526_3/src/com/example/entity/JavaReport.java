package com.example.entity;

public class JavaReport extends Report{

    public JavaReport(String name) {
        this.setName(name);
    }

    @Override
    public void target() {
        System.out.println(this.getName()+"的目的是：学会如何由Java程序的入门再转行");
    }

    @Override
    public void process() {
        System.out.println("回去也不学习，发现Java好难");
    }

    @Override
    public void result() {
        System.out.println("成功转行");
    }
}
