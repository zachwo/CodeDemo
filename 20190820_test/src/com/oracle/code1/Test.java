package com.oracle.code1;

/**
 * 单例模式
 */
public class Test {
    public static void main(String[] args) {
        Single s1 = Single.getSingle();
        Single s2 = Single.getSingle();
        Single s3 = Single.getSingle();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
