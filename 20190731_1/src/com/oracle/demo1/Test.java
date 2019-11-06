package com.oracle.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();   //自动上转型

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        list.addAll(list1);

        list.remove(4);
        for (String s:list){
            System.out.println(s);
        }


    }
}
