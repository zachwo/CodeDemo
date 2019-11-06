package com.oracle.demo7;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientSocket {
    public static List<Socket> sockets = new ArrayList<>();


    public static void addSocket(Socket socket){
        sockets.add(socket);
    }

}
