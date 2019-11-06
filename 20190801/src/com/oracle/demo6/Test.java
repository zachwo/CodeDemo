package com.oracle.demo6;

import java.net.SocketTimeoutException;
import java.util.Stack;

/**
 * Stack堆栈的应用
 */
public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.size());
        System.out.println("遍历栈：");
        for (String s:stack){
            System.out.println(s);
        }
        System.out.println("弹栈：");
        int size = stack.size();
        for (int i = 0;i<size;i++){
            System.out.println(stack.pop());
        }
//        for (int i = 0;i<size;i++){
//            System.out.println(stack.peek());
//        }
    }
}
