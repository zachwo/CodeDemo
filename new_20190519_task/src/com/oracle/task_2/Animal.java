package com.oracle.task_2;

public class Animal {
    private String name;
    private String sex;
    private int age;

    public Animal() {
    }

    public Animal(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void sleep(){
        System.out.println(this.name+"正在睡觉");
    }
    public void run(){
        System.out.println(this.name+"正在奔跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
