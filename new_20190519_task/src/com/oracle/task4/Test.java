package com.oracle.task4;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("张三");
        User u2 = new User("李四","23512af");
        User u3 = new User();

        System.out.println("当前共有"+User.getCount()+"用户：");
        u1.getInfo();
        u2.getInfo();
        u3.getInfo();
    }
}
