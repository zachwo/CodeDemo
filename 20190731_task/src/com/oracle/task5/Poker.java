package com.oracle.task5;

public class Poker {
    private String pattern; //黑桃、红桃、梅花、方块
    private String number;    //3、4、5、6、7、8、9、10、J、Q、K、A、2

    public Poker() {
    }

    public Poker(String pattern, String number) {
        this.pattern = pattern;
        this.number = number;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getPattern()+this.getNumber();
    }

}
