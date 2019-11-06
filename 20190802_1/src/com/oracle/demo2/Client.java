package com.oracle.demo2;

import com.sun.source.tree.Scope;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 * 服务器端和客户端可以分别独立运行，所以都有main方法
 * 单线程连接
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            String str = "hello";
            OutputStream out = socket.getOutputStream();
            out.write(str.getBytes());
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
