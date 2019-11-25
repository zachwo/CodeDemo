package com.example.entity;

public class A {
    public void fun(){
        System.out.println("A-->fun");
    }
    public void fun1(){
        fun();
    }
}
