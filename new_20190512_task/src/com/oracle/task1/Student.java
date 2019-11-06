package com.oracle.task1;

import java.io.FileOutputStream;

public class Student {
    private int number;
    private String name;
    private double mathScore;
    private double englishScore;
    private double computerScore;

    public Student() {
    }

    public Student(int number, String name, double mathScore, double englishScore, double computerScore) {
        this.number = number;
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.computerScore = computerScore;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(double computerScore) {
        this.computerScore = computerScore;
    }

    public double getTotal(){
        return mathScore+englishScore+computerScore;
    }

    public double getAvg(){
        return this.getTotal()/3;
    }

    public double getMax(){
        return Math.max(Math.max(mathScore,englishScore),englishScore);
    }

    public double getMin(){
        return Math.min(Math.min(mathScore,englishScore),englishScore);

    }
}
