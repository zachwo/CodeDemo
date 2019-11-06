package com.oracle.demo7;

/**
 * 一对多练习
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王五",20);
        Student stu4 = new Student("赵六",21);

        ClassNum cn = new ClassNum("一班");
        stu1.setClassNum(cn);
        stu2.setClassNum(cn);
        stu3.setClassNum(cn);
        stu4.setClassNum(cn);
        cn.getStus().add(stu1);
        cn.getStus().add(stu2);
        cn.getStus().add(stu3);
        cn.getStus().add(stu4);
        System.out.println("通过班级找学生：");
        for (Student s:cn.getStus()){
            System.out.println(s);
        }
        System.out.println("通过学生找班级：");
        System.out.println(stu1.getClassNum());

    }
}
