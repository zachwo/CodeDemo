package com.oracle.entity;

public class MyException extends Exception{
//    String name;
//    public MyException(String name){
//        this.name = name;
//    }

    public MyException(String exceptionName){
        super(exceptionName);
    }
}
