package com.oracle.task5;

import javax.sound.midi.Soundbank;
import java.security.Policy;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        ArrayList<Poker> pokerCard = new ArrayList<Poker>();
        String[] pattern = {"黑桃","红桃","梅花","方块"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        Operator op = new Operator();

        for (int i=0;i<pattern.length;i++){
            for(int j=0;j<number.length;j++){
                pokerCard.add( new Poker(pattern[i],number[j]) );
            }
        }

//        Iterator<Poker> iter = pokerCard.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        op.shuffle(pokerCard);

    }
}
