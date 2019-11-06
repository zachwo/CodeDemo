package com.oracle.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i<=10;i++){
            list.add(i);
        }
        System.out.println("赋值之后：");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }

        //使用Random类来打乱集合顺序
        for (int i = 0;i<100;i++) {
            int index1 = random.nextInt(list.size());
            int index2 = random.nextInt(list.size());

            int number = list.get(index1);
            list.set(index1,list.get(index2));
            list.set(index2,number);
        }

        System.out.println("打乱顺序之后：");
        iter = list.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }

        System.out.println("从小到大排序：");
        for (int i=0;i< list.size()-1;i++){
            for (int j = list.size()-1;j>i;j--){
                if (list.get(j)<list.get(j-1)){
                    int num = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,num);
                }
            }
        }
        iter = list.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }

        System.out.println("从大到小排序：" );
        for (int i = 0;i<list.size()-1;i++){
            for (int j = list.size()-1;j>i;j--){
                if (list.get(j)>list.get(j-1)){
                    int num = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,num);
                }
            }
        }
        iter = list.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }


    }
}
