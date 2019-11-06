package com.oracle.code6;

/**
 * 正则表达式过滤字符串
 */
public class Test {
    public static void main(String[] args) {
        String str = "iu7i8hy4jnb2";
        String numbers = str.replaceAll("[^0-9]","");
        System.out.println(numbers);
    }
}
