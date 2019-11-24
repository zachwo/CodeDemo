package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Modify {
    private StudentLibrary studentLibrary;

    public Modify() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do modify");
        System.out.println(studentLibrary);

        studentLibrary.showStudents();
        System.out.println("请输入需要修改的学生学号：");
        Scanner scan = new Scanner(System.in);
        String stuNum = scan.nextLine();
        if(studentLibrary.getStuByNum(stuNum)){
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
            System.out.println("请输入年龄：");
            String age = scan.nextLine();
            int stuAge = Integer.parseInt(age);

            Student modiStu = new Student(stuNum,stuName,stuClass,stuSex,stuAge);
            System.out.println(studentLibrary.modify(modiStu));
            studentLibrary.showStudents();
        }else{
            System.out.println("无此学号，请检查后重新输入：\n");
            this.action();
        }

    }
}
