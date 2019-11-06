package com.oracle.demo7;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.SQLOutput;

/**
 * 客户接收信息
 */
public class ClientInput implements Runnable{
    private Socket socket;

    public ClientInput(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;
        BufferedReader br = null;
        boolean flag = true;

        try {
            in = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            while (flag){
                String str1 = br.readLine();
                if (!str1.equals("end")){
                    System.out.println("服务器回应："+str1);
                }else {
                    flag = false;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(br!=null){
                    br.close();
                }
                if (in!=null){
                    in.close();
                }
                if (socket!=null){
                    socket.close();
                    socket = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
