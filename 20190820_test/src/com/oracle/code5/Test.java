package com.oracle.code5;

/**
 * 适配器设计模式
 */
public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        human.actionCreature();
        human.actionAnimal();
        human.actionHuman();
    }
}
