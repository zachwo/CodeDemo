package com.oracle.task5;

import com.sun.source.tree.SwitchTree;

public class Poker1 {
    private int color;
    private int number;

    public Poker1() {
    }

    public Poker1(int color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String c = "";
        String n = "";
        switch(color){
            case 0:
                c="方块";
                break;
            case 1:
                c="草花";
                break;
            case 2:
                c="红心";
                break;
            case 3:
                c="黑桃";
                break;
             default:
                 break;
        }
        switch (number){
            case 8:
                n = "J";
                break;
            case 9:
                n = "Q";
                break;
            case 10:
                n = "K";
                break;
            case 11:
                n = "A";
                break;
            case 12:
                n = "2";
                break;
            default:
                n = (number+3)+"";
                break;
        }
        return c+":"+n;

    }

    public int sort(Poker1 p){
        if (this.color<p.color){
            return -1;
        }else if(this.color>p.color){
            return 1;
        }else if(this.number<p.number){
            return -1;
        }else if(this.number>p.number){
            return 1;
        }else{
            return 0;
        }
    }

    public int compareTo(Poker1 p){
        if(this.number<p.number){
            return -1;
        }else if(this.number>p.number){
            return 1;
        }else if(this.color<p.color){
            return -1;
        }else if(this.color>p.color){
            return 1;
        }else {
            return 0;
        }
    }

}
