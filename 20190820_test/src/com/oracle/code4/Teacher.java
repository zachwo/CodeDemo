package com.oracle.code4;

public class Teacher implements Person {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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

    @Override
    public String activity() {
        return this.getAge()+"岁的教师"+this.getName()+"除了"+ Person.INFO+"还要上课";
    }
}
