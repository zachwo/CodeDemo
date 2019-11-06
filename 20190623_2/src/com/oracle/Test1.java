package com.oracle;

import com.oracle.entity.CCircle;
import com.oracle.entity.MyException;

public class Test1 {
    public static void main(String[] args) {
//        int[] array = {1,2,3};
//        try{
//            System.out.println(array[3]);
//        }catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("index out of bound!");
//            e.printStackTrace();
//        }finally {
//            System.out.println("程序执行结束");
//        }

//        int a = 10;
//        int b= 0;
//        if(b==0){
//            throw new ArithmeticException();
//        }else{
//            System.out.println(a/b);
//        }

        CCircle cc = new CCircle();
        try {
            cc.a(-1);
        }catch (MyException e){
            e.printStackTrace();
        }

    }
}
