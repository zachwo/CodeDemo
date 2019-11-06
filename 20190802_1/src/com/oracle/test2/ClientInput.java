package com.oracle.test2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientInput implements Runnable{

	private Socket socket;
	public ClientInput(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		
		InputStream in = null;
		try {
			in = socket.getInputStream();
			while(Client_1.flag){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte[] b = new byte[in.available()];
				in.read(b);
				String str = new String(b);
				if(!str.equals("")){
					System.out.println("获取的内容："+str);
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
