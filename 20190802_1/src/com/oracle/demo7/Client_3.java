package com.oracle.demo7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * demo6升级
 * 通过服务器转发实现客户与客户之间的信息交流
 */
public class Client_3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            //输出数据
            OutputStream out = socket.getOutputStream();
            PrintStream ps = new PrintStream(out);
            //接收数据
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //键盘接收字符串
            Scanner scan = new Scanner(System.in);
            String str = "";
            //主干
            new Thread(new ClientOutput(socket,scan)).start();
            new Thread(new ClientInput(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}