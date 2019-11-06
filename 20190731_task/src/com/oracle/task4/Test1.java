package com.oracle.task4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        //22选5
        while(set.size()<5){
            int number = random.nextInt(22)+1;
            set.add(number);
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            int i = iter.next();
            System.out.println(i);
        }

    }
}
