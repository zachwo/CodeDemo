package com.oracle.task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        names.add("张三");

        for (String name: names){
            System.out.println(name);
        }
        System.out.println();
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
