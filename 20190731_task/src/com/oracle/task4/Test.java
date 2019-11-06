package com.oracle.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<Integer>();

        for (int i = 0;i<22;i++){
            lists.add((int)(Math.random()*20)+3);
        }
        Iterator<Integer> iter = lists.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        System.out.println("第一次取数：");
        for (int i=0;i<5;i++){
            System.out.print(lists.get((int)(Math.random()*20+2))+" ");
        }
        System.out.println();
        System.out.println("第二次取数：");
        for (int i=0;i<5;i++){
            System.out.print(lists.get((int) (Math.random()*20+2))+" ");
        }
    }
}
