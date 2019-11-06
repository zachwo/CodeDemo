package com.oracle.demo3;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * demo2的优化版本
 * 转流实现网络编程中接受问题（取代in.available）
 * 单线程连接
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            String str = "hello";
            OutputStream out = socket.getOutputStream();
            //***********************************
            PrintStream ps =new PrintStream(out);
            ps.println(str);
            ps.close();
            //***********************************
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
