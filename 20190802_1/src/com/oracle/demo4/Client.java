package com.oracle.demo4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * demo2的优化版本
 * 单线程连接
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            String str = "hello";
            OutputStream out = socket.getOutputStream();
            out.write(str.getBytes());//转成字节数组输出
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
