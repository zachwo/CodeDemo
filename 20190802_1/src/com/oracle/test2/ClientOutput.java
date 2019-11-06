package com.oracle.test2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientOutput implements Runnable{

	private Socket socket;
	private Scanner scanner;
	private com.oracle.test2.User user;
	public ClientOutput(User user,Socket socket,Scanner scanner) {
		this.socket=socket;
		this.scanner=scanner;
		this.user=user;
	}
	@Override
	public void run() {
		
		OutputStream out  = null;
		try {
			out = socket.getOutputStream();
			while(Client_1.flag){
				System.out.println("请输入内容:");
				String str = scanner.nextLine();
				str = user.getUsername()+"|"+"all"+"|"+str;
				out.write(str.getBytes());
				if(out.equals("byebye")){
					Client_1.flag=false;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(socket!=null){
				try {
					socket.close();
					socket=null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
