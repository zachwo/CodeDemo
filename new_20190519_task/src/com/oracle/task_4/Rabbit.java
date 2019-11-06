package com.oracle.task_4;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("rabbits eat grass");
    }
}
