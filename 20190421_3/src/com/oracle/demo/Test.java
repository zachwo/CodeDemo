package com.oracle.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的练习
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //compile内参数为正则表达式：
        /**
         * 正则表达式中，\\\表示一个反斜线字符，
         * 又因为正则表达式中一个反斜线字符表转义，
         * 所以如果想要令正则表达式匹配一个输入的反斜线字符需要写四个\,
         * 即\\\\\\\
         */
//        Pattern p = Pattern.compile("\\\\");
        //得到matcher对象
//        Matcher m = p.matcher(str);
        //进行验证
//        System.out.println(m.matches());

        //简化版：匹配
        System.out.println("请输入内容：");
        String str = scan.nextLine();
        System.out.println(str.matches("\\\\"));

        //简化版：分割
        System.out.println("请输入内容：");
        String str2 = scan.nextLine();
        String[] strs = str2.split("\\d+");
        for (String s:strs){
            System.out.println(s);
        }

        //简化版：替换
        System.out.println("请输入内容：");
        String str3 = scan.nextLine();
        str3 = str3.replaceAll("\\d"," ");
        System.out.println(str3);
    }
}
