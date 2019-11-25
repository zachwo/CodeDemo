package com.example.entity;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person被创建了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "姓名："+this.getName()+"，年龄："+this.getAge();
    }
}
