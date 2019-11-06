package com.oracle.task5;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Poker1> pokers = new ArrayList<Poker1>();
        Random random = new Random();
        for (int i = 0;i<52;i++){
            pokers.add(new Poker1(i/13,i%13));
        }

//        System.out.println("扑克牌：");
//        for (Poker1 p:pokers){
//            System.out.println(p);
//        }

        for (int i = 0;i<100;i++){
            int index1 = random.nextInt(pokers.size());
            int index2 = random.nextInt(pokers.size());
            Poker1 p = pokers.get(index1);
            pokers.set(index1,pokers.get(index2));
            pokers.set(index2,p);
        }
//        System.out.println("扑克牌打乱后：");
//        for (Poker1 p:pokers){
//            System.out.println(p);
//        }

        //冒泡排序法排序：
        for (int i = 0;i<pokers.size()-1;i++){
            for(int j = pokers.size()-1;j>i;j--){
                if(pokers.get(j).sort(pokers.get(j-1))<0){
                    Poker1 p = pokers.get(j);
                    pokers.set(j,pokers.get(j-1));
                    pokers.set(j-1,p);
                }
            }
        }
//        System.out.println("扑克牌排序后：");
//        for (Poker1 p:pokers){
//            System.out.println(p);
//        }

        Poker1 p1 = new Poker1(0,0);
        Poker1 p2 = new Poker1(3,0);
        if(p1.compareTo(p2)<0){
            System.out.println(p2+"的值比"+p1+"大");
        }else if(p1.compareTo(p2)>0){
            System.out.println(p1+"的值比"+p2+"大");
        }else{
            System.out.println("两张牌一样");
        }

    }
}
