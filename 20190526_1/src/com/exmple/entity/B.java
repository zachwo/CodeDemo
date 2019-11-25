package com.exmple.entity;

public class B extends Person implements A,C {
    @Override
    public void fun() {
        System.out.println(INFO);
    }

    @Override
    public void fun1() {
        System.out.println(INFO+" B-->fun1");
    }

    @Override
    public void work() {
        System.out.println(INFO+ " B-->work");
    }
}
