package com.oracle.StudentManagementSystem;

import java.util.Scanner;

/**
 * 封装两个方法
 * 一个用来接收数字，另一个用来接收字符串
 */
public class Input {
    private Scanner scan;

    public Input(Scanner scan) {
        this.scan = scan;
    }

    /**
     * 获取字符串
     * @param info 提示信息
     * @return 返回输入的字符串
     */
    public String getString(String info){
        System.out.println(info);
        String str = scan.nextLine();
        return str;
    }

    /**
     * 获取数字信息
     * @param info 提示信息
     * @param errorInfo 错误信息
     * @return
     */
    public int getInt(String info,String errorInfo){
        String str = getString(info);//先用字符串传递进来再转换为整数
        //正则表达式判断字符串是否由整数组成
        while(!str.matches("\\d+")){
            System.out.println(errorInfo);
            str = getString(info);
        }
        Integer number = Integer.parseInt(str);
        return number;
    }
}
