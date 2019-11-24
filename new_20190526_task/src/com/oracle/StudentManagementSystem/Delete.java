package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Delete {
    private StudentLibrary studentLibrary;

    public Delete() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do delete");
        System.out.println(studentLibrary);

        studentLibrary.showStudents();
        System.out.println("请输入需要删除的学生学号：");
        Scanner scan = new Scanner(System.in);
        String stuNum  = scan.nextLine();

        if (studentLibrary.getStuByNum(stuNum)){
            System.out.println(studentLibrary.delete(stuNum));
        }else{
            System.out.println("无此学号，请检查后重新输入：\n");
            this.action();
        }
        studentLibrary.showStudents();


    }
}
