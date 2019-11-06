package com.oracle.test2;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientSocket {

	public static List<Socket> sockets = new ArrayList<Socket>();
	public static void addSocket(Socket socket){
		sockets.add(socket);
	}
	
	
	
	
}
