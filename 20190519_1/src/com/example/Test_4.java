package com.example;

import com.example.entity.SmallStudent;
import com.example.entity.Student;

public class Test_4 {
    public static void main(String[] args) {
        Student stu = new Student();
        //SmallStudent stu = new SmallStudent();
        stu.setName("张三");
        stu.setAge(19);
        stu.setSchool("林大");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getInfo());

    }
}
