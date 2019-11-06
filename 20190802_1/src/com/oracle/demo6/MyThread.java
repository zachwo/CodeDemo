package com.oracle.demo6;

import java.io.*;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class MyThread implements Runnable {
    private Socket socket = null;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;//得到监听端口的输入流对象
        BufferedReader br = null;

        OutputStream out = null;
        PrintStream ps = null;

        try {
            in = socket.getInputStream();//得到监听端口的输入流对象
            br = new BufferedReader(new InputStreamReader(in));

            out = socket.getOutputStream();
            ps = new PrintStream(out);

            boolean flag1 = true;
            while (flag1){
                String str = br.readLine(); //BufferedReader接收消息
                if (!str.equals("byebye")){
                    System.out.println("客户端发送过来的信息："+str);
                    str = "Echo: "+str;
                    ps.println(str);    //发送反馈信息

                }else {
                    System.out.println("用户结束了客户端，信息发送结束");
                    flag1 = false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                br.close();
                out.close();
                ps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        } finally {
//            if (in!=null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (out!=null){
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (ps!=null){
//                ps.close();
//            }
//            if (br!=null){
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (socket!=null){
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
