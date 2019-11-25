package com.example.entity;

import java.util.Scanner;

public class Operator {
    //定义一个属性输入对象
    private Input input;

    public Operator() {

        input = new Input(new Scanner(System.in));
        //input = new Input();
    }
    public String getUserName(){
        String username = input.getString("请输入用户名：");
        return username;
    }
    public String getPassword(){
        String password = input.getString("请输入密码：");
        return password;
    }

    public boolean check(String username, String password){
        if(username.equals("admin")&&password.equals("123")){
            return true;
        }else{
            return false;
        }
    }

    public void operator(int time){
        String username = this.getUserName();
        String password = this.getPassword();
        //int time = 2;
        if(check(username,password)){
            System.out.println("欢迎"+username+"登录系统");
        }else{
            if(time<=0){
                System.out.println("连续多次用户名或密码错误，暂时冻结账户，请联系客服。");
                System.exit(0);//整个程序系统停止，0代表正常推出，非0数字代表非正常推出
                //return;
            }else {
                time=time-1;
                System.out.println("用户名或密码错误，请重新输入：");
                operator(time);
            }

        }
    }

}
