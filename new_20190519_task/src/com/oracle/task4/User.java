package com.oracle.task4;

public class User {
    private String name;
    private String command;
    private static int count;

    public User() {
        count++;
        this.name = "用户"+this.getCount();
        this.command = "000000";

    }

    public User(String name) {
        this();
        this.name = name;
    }

    public User(String name, String command) {
        this();
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public static int getCount() {
        return count;
    }

    public void getInfo(){
        System.out.println("姓名:"+this.getName()+",\t口令："+this.getCommand());
    }
}
