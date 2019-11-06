package com.oracle.task2;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Operator op = new Operator();

        for (int i=0;i<30;i++){
            list.add((int)(Math.random()*10+1));
        }

        System.out.println("打乱顺序后输出：");
        op.printArrayList(list);

        System.out.println("从小到大输出：");
        list = op.sortFromMin(list);
        op.printArrayList(list);

        System.out.println("从大到小输出：");
        list = op.sortFromMax(list);
        op.printArrayList(list);
    }
}
