package com.oracle.demo6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) {
        //Server等待客户端链接
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);//服务器监听的端口号
            boolean flag = true;
            while (flag){
                System.out.println("等待客户端链接...");
                Socket socket = server.accept();    //  线程阻塞方法，用来等待客户端链接
                //每次得到一个socket之后启动一个线程：
                new Thread(new MyThread(socket)).start();


            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

