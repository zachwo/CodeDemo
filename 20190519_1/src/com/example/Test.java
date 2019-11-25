package com.example;

import com.example.entity.MyArray;
import com.example.entity.ReverseArray;
import com.example.entity.SortArray;

public class Test {
    public static void main(String[] args) {
        MyArray ma = new MyArray(3);
        for (int i = 0;i<10;i++){
            ma.add(i+1);
        }
        //ma.printArray();

        SortArray sa = new SortArray(3);
        for (int i = 0;i<10;i++){
            sa.add((int)(Math.random()*10+1));
        }
//        System.out.println("排序前");
//        sa.printArray();
//        System.out.println("排序后");
//        sa.sort();
//        sa.printArray();

        ReverseArray ra = new ReverseArray(3);
        for (int i = 0;i<10;i++){
            ra.add(i+1);
        }
        System.out.println("反向前");
        ra.printArray();
        System.out.println("反向后");
        ra.reverse();
        ra.printArray();



    }
}
