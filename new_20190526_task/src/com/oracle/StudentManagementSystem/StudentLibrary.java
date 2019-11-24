package com.oracle.StudentManagementSystem;

/**
 * 单例模式创建学生信息仓库
 */
public class StudentLibrary {

    private Student[] students;
    private int index;
//    使用单例设计模式，使其他类操作同一个student library库
    private StudentLibrary() {
        students = new Student[0];
    }
    private static StudentLibrary studentLibrary = null;
    static {
        studentLibrary = new StudentLibrary();
    }
    public static StudentLibrary getStudentLibrary(){
        return studentLibrary;
    }

    public String add(Student stu){
        String stuNum = stu.getStuNum();

        if (getStuByNum(stuNum)){
            index = students.length;
            Student[] newStu = new Student[index+1];
            for(int i=0; i<index ;i++){
                newStu[i] = students[i];
            }
            newStu[newStu.length - 1] = stu;
            students = newStu;

            return "新学生添加成功";
        }else{
            return "该学生已存在";
        }

    }

    private Boolean getStuByNum(String stuNum){
        for (Student s : students){
            if (s.getStuNum()==stuNum){
                return false;
            }
        }
        return true;
    }
}
