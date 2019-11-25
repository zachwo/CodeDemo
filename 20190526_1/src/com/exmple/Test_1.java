package com.exmple;

import com.exmple.entity.Person;
import com.exmple.entity.Student;

public class Test_1 {
    public static void main(String[] args) {
        Student stu = new Student("张三",19,"兴华");
//        stu.setName("张三");
//        stu.setAge(19);
        System.out.println("姓名："+stu.getName());
        stu.work();
    }
}
