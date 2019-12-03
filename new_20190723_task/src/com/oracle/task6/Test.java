package com.oracle.task6;

import java.awt.font.FontRenderContext;
import java.util.EnumSet;

/**
 * 6.按照“姓名：年龄：成绩|姓名：年龄：成绩”的格式
 * 定义字符串“张三:21:98|李四：22:89|王五：20:70”，
 * 要求将每组值分别保存在Student对象中，并对这些对象进行排序，
 * 排序原则为：按照成绩由高到低进行排序，如果成绩相等，则按照年龄由低至高排序
 */
public class Test {
    public static void main(String[] args) {
        String string = "张三:21:98|李四:22:70|王五:20:70";
        String[] strings = string.split("\\|");
        Student[] students = new Student[strings.length];
        //获取学生数组
        int index = 0;
        for (String s:strings){
//            System.out.println(s);
            String[] items = s.split(":");
            String name = items[0];
            int age = Integer.parseInt(items[1]);
            int grades = Integer.parseInt(items[2]);
            Student student = new Student(name,age,grades);
            students[index] = student;
            index++;
        }
        //按成绩由高到低排序
        for (int i=0; i<students.length-1;i++){
            for (int j=1; j<students.length; j++){
                if (students[i].getGrades()>students[j].getGrades()){

                }else if(students[i].getGrades()<students[j].getGrades()){
                    Student t;
                    t = students[i];
                    students[i]=students[j];
                    students[j]=t;
                }else{
                    //按年龄由低到高排序
                    if (students[i].getAge()>students[j].getAge()){
                        Student t;
                        t = students[i];
                        students[i]=students[j];
                        students[j]=t;
                    }
                }
            }
        }


        for (Student s:students){
            System.out.println(s);
        }




    }
}
