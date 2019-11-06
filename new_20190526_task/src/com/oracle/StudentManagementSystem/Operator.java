package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Operator {
    private Input in = null;

    public Operator() {
        in = new Input(new Scanner(System.in));
    }

    public void operator(){
        Menu.show();
        int n = in.getInt("请选择您要执行的操作：","输入的选项格式不正确，请重新输入");
        switch (n){

        }
    }
}
