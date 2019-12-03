package com.oracle.task3;

import java.util.Scanner;

/**
 * 3.输入一个Email地址，然后使用正则表达式验证地址是否正确
 * 正则表达式相关知识见20190421_3
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("请输入一个Email地址：");
            String email = scan.nextLine();
            String regex = "^\\w{5,16}@[0-9a-zA-Z]{2,7}(\\.net|\\.com|\\.cn)$";
            if (email.matches(regex)){
                System.out.println("邮箱格式验证成功！");
            }else{
                System.out.println("邮箱格式验证失败，请检查格式后重新输入");
            }
        }

    }
}
