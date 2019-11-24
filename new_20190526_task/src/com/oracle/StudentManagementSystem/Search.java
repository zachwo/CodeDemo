package com.oracle.StudentManagementSystem;

public class Search {
    private StudentLibrary studentLibrary;

    public Search() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do search");
        System.out.println(studentLibrary);
    }
}
