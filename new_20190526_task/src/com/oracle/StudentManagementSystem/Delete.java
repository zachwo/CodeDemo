package com.oracle.StudentManagementSystem;

public class Delete {
    private StudentLibrary studentLibrary;

    public Delete() {
//        studentLibrary = new StudentLibrary();
        studentLibrary = StudentLibrary.getStudentLibrary();
    }

    public void action(){
        System.out.println("do delete");
        System.out.println(studentLibrary);
    }
}
