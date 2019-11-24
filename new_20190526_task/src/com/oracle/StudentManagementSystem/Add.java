package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Add {
    private StudentLibrary studentLibrary;

    public Add() {
//        studentLibrary = new StudentLibrary(); 错误，这种写法会新建学生数据库
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do add");
        System.out.println(studentLibrary);

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学号：");
        String stuNum = scan.nextLine();
        System.out.println("请输入姓名：");
        String stuName = scan.nextLine();
        System.out.println("请输入班级：");
        String stuClass = scan.nextLine();
        System.out.println("请输入性别：");
        String stuSex = scan.nextLine();
        boolean flag = true;
        while (flag){
            if (stuSex.equals("男") || stuSex.equals("女")){
                flag = false;
            }else{
                System.out.println("性别输入不合法，请重新输入：");
                stuSex = scan.nextLine();
            }
        }
        System.out.println("请输入年龄");
        String age = scan.nextLine();
        int stuAge = Integer.parseInt(age);

        Student newStu = new Student(stuNum,stuName,stuClass,stuSex,stuAge);
        System.out.println(studentLibrary.add(newStu));
    }
}
