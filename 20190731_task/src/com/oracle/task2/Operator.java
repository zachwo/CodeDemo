package com.oracle.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Operator {

    public ArrayList<Integer> sortFromMin(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Iterator<Integer> iter =  list.iterator();

        while(!list.isEmpty()){
            int min = list.get(0);
            int minIndex = 0;
            while (iter.hasNext()){
                int index = list.indexOf(iter.next());
                int element = list.get(index);

                if(element<min){
                    min = element;
                    minIndex = index;
                }
            }
            list1.add(list.get(minIndex));
            list.remove(minIndex);
            iter = list.iterator();
        }

        return list1;
    }

    public ArrayList<Integer> sortFromMax(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Iterator<Integer> iter =  list.iterator();

        while(!list.isEmpty()){
            int max = list.get(0);
            int maxIndex = 0;
            while (iter.hasNext()){
                int index = list.indexOf(iter.next());
                int element = list.get(index);

                if(element>max){
                    max = element;
                    maxIndex = index;
                }
            }
            list1.add(list.get(maxIndex));
            list.remove(maxIndex);
            iter = list.iterator();
        }

        return list1;
    }

    public void printArrayList(ArrayList<Integer> list){
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
}
