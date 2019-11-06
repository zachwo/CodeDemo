package com.oracle.demo5;

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
            System.out.println("等待客户端链接...");
            Socket socket = server.accept();    //  线程阻塞方法，用来等待客户端链接

            InputStream in = socket.getInputStream();//得到监听端口的输入流对象
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            OutputStream out = socket.getOutputStream();
            PrintStream ps = new PrintStream(out);

            boolean flag = true;
            while (flag){
                String str = br.readLine(); //BufferedReader接收消息
                if (!str.equals("byebye")){
                    System.out.println("客户端发送过来的信息："+str);
                    str = "Echo: "+str;
                    ps.println(str);    //发送反馈信息

                }else {
                    System.out.println("用户结束了客户端，信息发送结束");
                    flag = false;
                }
            }

            ps.close();
            br.close();
            in.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
