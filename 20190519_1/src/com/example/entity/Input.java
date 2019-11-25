package com.example.entity;

import java.util.Scanner;

public class Input {
    private Scanner scan;
    //private Scanner scan = new Scanner(System.in);

    public Input(Scanner scan){
        this.scan = scan;
    }


    public String getString(String info){//info 为提示信息
        System.out.println(info);
        String str = scan.nextLine();
        return str;
    }
}
