package com.example;

import com.example.entity.Info;
import com.example.entity.Person;
import com.example.entity.Student;

public class Test {
    public static void main(String[] args) {
        //利用向上转型直接给抽象类创建对象：
        Person per = new Student("张三",19);
        per.eat();
        Info info = new Student("李四",20);
        ((Student) info).eat();
    }
}
