package com.oracle.recycle;

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("张三");
        System.gc();

        new Person("李四");
        System.gc();
    }
}
