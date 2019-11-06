package com.oracle.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	public static void main(String[] args) {
		//Server
		ServerSocket server = null;
		try {
			server = new ServerSocket(8888);
			
			boolean f = true;
			while(f){
				System.out.println("等待客户端连接");
				Socket socket = server.accept();
				ClientSocket.addSocket(socket);
				new Thread(new MyThread(socket)).start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

