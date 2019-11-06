package com.oracle.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_3 {
    public static boolean flag=true;
    public static void main(String[] args) {
        Socket socket = null;
        User user = new User("王五");
        try {
            socket = new Socket("localhost", 8888);
            Scanner scanner = new Scanner(System.in);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            new Thread(new ClientOutput(user,socket, scanner)).start();
            new Thread(new ClientInput(socket)).start();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
