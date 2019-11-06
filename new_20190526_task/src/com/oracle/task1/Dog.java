package com.oracle.task1;

public class Dog implements Animal,Pet {
    private String name;
    private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("种类："+this.getAnimalType()+"\t昵称："+this.getName()+"\t颜色："+this.getColor());
    }

    @Override
    public String getAnimalType() {
        return "狗";
    }
}
