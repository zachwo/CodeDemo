package com.oracle.task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        String str1 = scan.nextLine();
        System.out.println("请输入第二个整数：");
        String str2 = scan.nextLine();
        System.out.println("请输入第三个整数：");
        String str3 = scan.nextLine();

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        int i3 = Integer.parseInt(str3);

        int max = i1;
        int min = i1;

        if(i2<min){
            min = i2;
        }
        if(i3<min){
            min = i3;
        }
        if(i2>max){
            max = i2;
        }
        if(i3>max){
            max = i3;
        }
        System.out.println(max);
        System.out.println(min);


    }
}
