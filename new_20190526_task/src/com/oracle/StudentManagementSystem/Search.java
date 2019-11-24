package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Search {
    private StudentLibrary studentLibrary;

    public Search() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do search");
        System.out.println(studentLibrary);

        System.out.println("请选择查询方式：");
        System.out.println("1.按id查询");
        System.out.println("2.查询全部");

        try {
            Scanner scan =new Scanner(System.in);
            String s = scan.nextLine();
            int way = Integer.parseInt(s);
            if (way==1 || way==2){
                switch (way){
                    case 1:
                        boolean flag = true;
                        while (flag){
                            System.out.println("请输入学号：");
                            String stuNum = scan.nextLine();
                            if (studentLibrary.getStuByNum(stuNum)){
                                flag = false;
                                System.out.println(studentLibrary.search(stuNum));
                            }else{
                                System.out.println("无此学号，请检查后重新输入：\n");
                            }
                        }
                        break;
                    case 2:
                        studentLibrary.showStudents();
                        break;
                }
            }else{
                System.out.println("无效输入，请重新操作");
                this.action();
            }
        }catch (NumberFormatException e){
            System.out.println("无效输入，请重新操作");
            this.action();
        }

    }



}
