package com.oracle.demo7;

import java.sql.SQLOutput;
import java.util.SortedMap;

/**
 * 多对多练习
 */
public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王五",20);
        Student stu4 = new Student("赵六",21);

        Teacher t1 = new Teacher("张锡英");
        Teacher t2 = new Teacher("李莉");
        Teacher t3 = new Teacher("李丹");
        Teacher t4 = new Teacher("李实");

        t1.getStus().add(stu1);
        t1.getStus().add(stu2);
        t1.getStus().add(stu3);
        stu1.getTeachers().add(t1);
        stu2.getTeachers().add(t1);
        stu3.getTeachers().add(t1);

        t2.getStus().add(stu1);
        t2.getStus().add(stu2);
        stu1.getTeachers().add(t2);
        stu2.getTeachers().add(t2);

        t3.getStus().add(stu1);
        stu1.getTeachers().add(t3);

        t4.getStus().add(stu4);
        stu4.getTeachers().add(t4);

        System.out.println(stu1.getName()+"的所有老师：");
        for (Teacher t:stu1.getTeachers()){
            System.out.println(t);
        }
        System.out.println(t1.getName()+"的所有学生：");
        for (Student s:t1.getStus()){
            System.out.println(s);
        }

    }
}
