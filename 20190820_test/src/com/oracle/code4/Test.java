package com.oracle.code4;

import java.io.PrintStream;

/**
 * 代理设计模式
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        String str = proxy.activity();

        System.out.println(str);
    }
}
