package com.oracle.task5;

import java.util.ArrayList;
import java.util.Iterator;

public class Operator {



    public void shuffle(ArrayList<Poker> pokerCard){

        ArrayList<Poker> pokerCard1 = pokerCard;
        Iterator<Poker> iter = pokerCard1.iterator();

        while (iter.hasNext()){
            int left = pokerCard1.size();
            int i = left%10;
            int j = left/10;
            int index =  (int)(Math.random()*(j*10)+i-1);
            Poker p = pokerCard1.get(index);
            System.out.println(p);
//            System.out.println("j:"+j+" i:"+i);
            pokerCard1.remove(index);
        }
    }

    public ArrayList<Poker> sort(ArrayList<Poker> pokerCard){
        ArrayList<Poker> sortedPoker  =  new ArrayList<Poker>();
        Iterator<Poker> iter = pokerCard.iterator();

        while (iter.hasNext()){
            int index = pokerCard.indexOf(iter.next());
            Poker card = pokerCard.get(index);
            int count = 0;
            if(card.getPattern()=="方块"){
                
            }
        }

        return sortedPoker;
    }

}
