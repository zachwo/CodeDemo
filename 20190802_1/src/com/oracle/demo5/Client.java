package com.oracle.demo5;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * demo2升级版
 * 服务器接收用户发送的消息后打印输出消息再反馈一条新的信息："Echo：+原信息"
 * 单线程连接
 */
public class Client {
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
            boolean flag = true;
            while (flag){
                System.out.println("请输入一段字符串，结束进程请输入\"byebye\"");
                str = scan.nextLine();
                ps.println(str);//打印流传出去
                if (!str.equals("byebye")){
                    Thread.sleep(500);//休眠300ms用来给服务器响应的时间
                    String str1 = br.readLine();//BufferedReader接回来
                    System.out.println("服务器回应："+str1);

                }else{
                    System.out.println("您结束了本进程。");
                    flag = false;
                }

            }
            //关流
            in.close();
            ps.close();
            br.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
