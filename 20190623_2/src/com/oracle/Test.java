package com.oracle;

import com.oracle.entity.MyException;

public class Test {
    public static void main(String[] args){
        try{
            div(10,0);
        }catch (Exception e){
            System.out.println("对异常进行捕获："+e);
        }
    }
    public static void div(int i,int j) throws Exception{
        System.out.println("计算开始");
        try{
            System.out.println(i/j);
        }catch(ArithmeticException e){
            throw new MyException("自定义的异常");
        }finally{
            System.out.println("程序结束");
        }
    }
}
