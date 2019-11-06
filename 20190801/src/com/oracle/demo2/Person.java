package com.oracle.demo2;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
    public int compareTo(Person o) {
        if (this.age<o.age){
            return -1;
        }else if(this.age>o.age){
            return 1;

        }else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return this.name+this.age+"岁";
    }
}
