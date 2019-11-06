package com.oracle.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) {
        //Server等待客户端链接
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);
            System.out.println("等待客户端链接");
            Socket socket = server.accept();    //  线程阻塞方法，用来等待客户端链接(侦听并接收到此嵌套字的连接)
            InputStream in = socket.getInputStream();
            //***********************************
            List<Byte> list = new ArrayList<>();
            int temp = 0;
            while ( (temp=in.read()) != -1 ){
                list.add((byte) temp);
            }
            byte[] bs = new byte[list.size()];
            for (int i = 0;i<list.size();i++){
                bs[i] = list.get(i);
            }
            String str = new String(bs);
            //***********************************
            System.out.println("客户端发送过来的信息："+str);
//            br.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
