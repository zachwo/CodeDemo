package com.example;
import com.example.entity.Math;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int i = 10;//基本数据类型创建在栈里
//        int j = 10;
//        System.out.println(i/j);
//        Math.div(10,0);
//        try{
//            System.out.println(i/j);
//        }catch (ArithmeticException e){
//            System.out.println("当前出现了算数异常");
//        }finally{
//            System.out.println("无论是否产生异常，finally语句都会被执行");
//        }
//        System.out.println("程序执行结束");


        boolean flag = true;
        while(flag){
            Scanner scan = new Scanner(System.in);

            System.out.println("请输入一个数字：");
            String num1 = scan.nextLine();
            System.out.println("请输入一个数字：");
            String num2 = scan.nextLine();

            try{
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                System.out.println(number1/number2);
            }catch (ArithmeticException e){
                System.out.println("出现了异常：" + e);
            }catch(NumberFormatException e){
                System.out.println("出现了异常：" + e);
            }finally{
//            System.out.println("此处应为一个finally语句");
            }
            System.out.println("程序执行结束\n");
            System.out.println("请输入下一个flag值");
            String flag1 = scan.nextLine();
            flag = Boolean.parseBoolean(flag1);

        }
    }
}
