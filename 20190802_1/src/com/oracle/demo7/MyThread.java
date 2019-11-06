package com.oracle.demo7;

import java.io.*;
import java.net.Socket;
import java.util.List;

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



            boolean flag1 = true;
            while (flag1){
                String str = br.readLine(); //BufferedReader接收消息
                if (!str.equals("byebye")){
                    System.out.println("客户端发送过来的信息："+str);
                    //*******************************************
                    List<Socket> sockets = ClientSocket.sockets;
                    for (int i = 0;i<sockets.size();i++){
                        if (!sockets.get(i).equals(socket)){
                            String str1 = " 用户"+i+"回应："+str;

                            out = sockets.get(i).getOutputStream();
                            ps = new PrintStream(out);
                            ps.println(str1);    //发送反馈信息
                        }else{
                            out = sockets.get(i).getOutputStream();
                            ps = new PrintStream(out);
                            String str2 = "Echo from server: "+str;
                            ps.println(str2);
                        }
                    }
                    //*******************************************

                }else {
                    System.out.println("用户结束了客户端，信息发送结束");
                    flag1 = false;
                    out = socket.getOutputStream();
                    ps = new PrintStream(out);
                    ps.println("end");
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
