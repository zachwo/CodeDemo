package com.oracle.StudentManagementSystem;

/**
 * 单例模式创建学生信息仓库
 */
public class StudentLibrary {

    private static Student[] students;
    private int index;
    private int location;
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
//  添加学生信息
    public String add(Student stu){
        String stuNum = stu.getStuNum();

        if (!getStuByNum(stuNum)){
            index = students.length;
            Student[] newStus = new Student[index+1];
            for(int i=0; i<index ;i++){
                newStus[i] = students[i];
            }
            newStus[newStus.length - 1] = stu;
            students = newStus;

            return "新学生添加成功";
        }else{
            return "该学生已存在";
        }
    }


//    删除学生信息
    public String delete(String stuNum){
        index = students.length;
        // 定位需要删除的学生信息在原学生数组中的位置
        for (int i = 0; i<index;i++){
            if (students[i].getStuNum().equals(stuNum)){
                location = i;
            }
        }
        //更新学生数据库
        Student[] newStus = new Student[index-1];
        for (int i=0;i<location;i++){
            newStus[i] = students[i];
        }
        for (int i=location;i<index-1;i++){
            newStus[i] = students[i+1];
        }
        students = newStus;
        return "学生信息删除成功！";

    }
    public String modify(Student student){
        index = students.length;
        for (int i=0; i<index; i++){
            if(students[i].getStuNum().equals(student.getStuNum())){
                students[i] = student;
            }
        }
        return "学生信息更新完成！";
    }

    public Student search(String stuNum){
        index = students.length;
        Student student = null;
        for (int i=0; i<index ;i++){
            if (students[i].getStuNum().equals(stuNum)){
                student = students[i];
            }
        }
        return student;
    }


    public Boolean getStuByNum(String stuNum){
        for (Student s : students){
            if (s.getStuNum().equals(stuNum)){
                return true;
            }
        }
        return false;
    }

    public void showStudents(){
        System.out.println("学生列表如下：");
        for (Student student : students){
            System.out.println(student);
        }
    }


//    不直接公开数据库，为后期的身份验证做准备
//    public Student[] getStudents() {
//        return students;
//    }
}
