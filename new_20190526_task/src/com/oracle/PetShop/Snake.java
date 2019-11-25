package com.oracle.PetShop;

public class Snake implements Animal {
    private String name;
    private String color;

    public Snake() {
    }

    public Snake(String name, String color) {
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
        System.out.println(this.getName()+"是一条蛇，它的颜色是"+this.getColor());
    }

    @Override
    public String getAnimalType() {
        return "蛇";
    }
}
