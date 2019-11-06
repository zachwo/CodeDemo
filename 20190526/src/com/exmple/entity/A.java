package com.exmple.entity;
//接口的性质会使得常量和方法前自动加上 public static （接口中只能包含全局常量和公共的抽象方法）
public interface A {
    //全局常量
    public static final String INFO = "CHINA";//等价于final String INFO = "CHINA";

    //公共的抽象方法
    public abstract void fun();//等价于直接写void fun();
}
