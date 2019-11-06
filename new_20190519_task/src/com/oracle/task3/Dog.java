package com.oracle.task3;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void print(){
        System.out.println("这条狗"+this.age+"岁了，名叫"+this.name+",颜色是"+this.color);
    }
}
