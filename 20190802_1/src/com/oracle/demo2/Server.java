package com.oracle.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 */

public class Server {
    public static void main(String[] args) {

        //Server等待客户端链接
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);
            System.out.println("等待客户端链接");
            Socket socket = server.accept();    //  线程阻塞方法，用来等待客户端链接
            InputStream in = socket.getInputStream();

            while (true){ //姑且认为是用来吃掉网络缓冲
//                System.out.println(in.available());
                if (in.available()!= 0){
                    System.out.println(in.available());
                    break;
                }
            }
            byte[] b= new byte[in.available()];
            in.read(b);
            String str = new String(b);
            System.out.println("客户端发送过来的信息："+str);
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
