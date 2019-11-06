package com.oracle.task3;

/**
 * 微信红包的实现
 */
public class Test {
    public static void main(String[] args) {
        RedPackage rp = new RedPackage(200,30);
        for (int i = 0;i<42;i++){   //模拟12个人抢10个红包
            rp.open("张三"+i);
            System.out.println("-----------------------------------------");
        }
    }
}
