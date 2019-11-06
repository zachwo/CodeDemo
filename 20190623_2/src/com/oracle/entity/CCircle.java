package com.oracle.entity;

public class CCircle {
    public void a(int r) throws MyException{
        if(r>=0){
            System.out.println(java.lang.Math.PI*r*r);
        }else{
            throw new MyException("半径必须为正数");
        }
    }
}
