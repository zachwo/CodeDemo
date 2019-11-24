package com.oracle.StudentManagementSystem;

public class Modify {
    private StudentLibrary studentLibrary;

    public Modify() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do modify");
        System.out.println(studentLibrary);

    }
}
