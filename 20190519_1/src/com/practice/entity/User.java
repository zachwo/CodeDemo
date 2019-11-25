package com.practice.entity;

public class User {
    private String name;
    private String password;
    private static int count;
    //构造方法
    public User() {
        count++;//重要！！！
    }

    public User(String name) {
        this();//先调用无参构造方法
        this.name = name;
    }

    public User(String name, String password) {
        this(name);
        this.name = name;
        this.password = password;
    }

    //get&set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static int getCount() {
        return count;
    }

    public String getInfo(){
        return "用户名："+this.getName()+"\t口令："+this.getPassword()+"\t当前产生了"+count+"位用户";
    }
}
