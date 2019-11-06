package com.oracle.code3;

/**
 * 工厂模式（接口子类）
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("李四",30);
        String str = teacher.activity();

        System.out.println(str);
    }
}
