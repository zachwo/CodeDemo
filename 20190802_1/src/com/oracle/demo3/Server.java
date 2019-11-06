package com.oracle.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
    public static void main(String[] args) {
        //Server等待客户端链接
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);//服务器监听的端口号
            System.out.println("等待客户端链接");
            Socket socket = server.accept();    //  线程阻塞方法，用来等待客户端链接
            InputStream in = socket.getInputStream();//得到监听端口的输入流对象
            //****************************************************************
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = br.readLine();
            //****************************************************************
            System.out.println("客户端发送过来的信息："+str);
            br.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
