package com.practice;

import com.practice.entity.User;

public class Test_4 {
    public static void main(String[] args) {
        User user1 = new User("admin","admin");
        System.out.println(user1.getInfo());
        User user2 = new User("scote");
        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
    }
}
