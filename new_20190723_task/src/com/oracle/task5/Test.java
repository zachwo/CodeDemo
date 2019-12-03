package com.oracle.task5;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 5.编写程序，实现国际化应用，从命令行输入不同的国家代码
 * 例如：1表示中国、2表示美国，然后根据输入的代号的不同调用不同的资源文件显示信息。
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入数字选择显示语言：");
        System.out.println("1:简体中文");
        System.out.println("2.美式英语");


        Locale china = new Locale("zh","CN");
        Locale america = new Locale("en","US");
        ResourceBundle rb1 = ResourceBundle.getBundle("message",china);
        ResourceBundle rb2 = ResourceBundle.getBundle("message",america);

        boolean flag = true;
        while (flag){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            if(s.matches("[12]")){
                flag = false;
                int i = Integer.parseInt(s);
                switch (i){
                    case 1:
                        String s1 = rb1.getString("info");
                        System.out.println(s1);
                        break;
                    case 2:
                        String s2 = rb2.getString("info");
                        System.out.println(s2);
                        break;
                }
            }else{
                System.out.println("输入格式有误，请重新输入");
            }
        }

    }
}
