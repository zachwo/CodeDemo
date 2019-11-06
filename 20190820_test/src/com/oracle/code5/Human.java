package com.oracle.code5;

public class Human extends Animal implements Creature {
    public void actionHuman(){
        System.out.println("人有思想");
    }

    @Override
    public void actionCreature() {
        System.out.println(Creature.FEATURE1);
    }

}
