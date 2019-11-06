package com.oracle.task_4;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("rabbit");
        Tiger tiger = new Tiger("tiger");

        rabbit.eat();
        rabbit.sleep();
        tiger.eat();
        tiger.sleep();
    }
}
