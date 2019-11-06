package com.oracle.task_4;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("tigers eat meat");
    }
}
