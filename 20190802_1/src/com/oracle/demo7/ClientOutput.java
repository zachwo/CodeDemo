package com.oracle.demo7;

import com.oracle.demo2.Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户输出信息
 */
public class ClientOutput implements Runnable{

    private Socket socket;
    private Scanner scanner;
    public ClientOutput(Socket socket, Scanner scanner) {
        this.socket = socket;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        boolean flag = true;
        OutputStream out = null;
        PrintStream ps = null;
        String str = "";
        try {
            out = socket.getOutputStream();
            ps = new PrintStream(out);
            while (flag){
                System.out.println("请输入内容：");
                str = scanner.nextLine();
                ps.println(str);
                if (str.equals("byebye")){
                    flag = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(ps!=null){
                ps.close();
            }
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                socket = null;

            }
        }

    }
}
