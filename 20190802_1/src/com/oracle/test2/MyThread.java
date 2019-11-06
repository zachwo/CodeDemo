package com.oracle.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class MyThread implements Runnable{

	private Socket socket = null;
	public MyThread(Socket socket ){
		this.socket=socket;
	}
	@Override
	public void run() {
		InputStream in = null;
		OutputStream out= null;
		try {
			in = socket.getInputStream();
			
			boolean flag=true;
			while(flag){
				byte[] b = new byte[in.available()];
				in.read(b);
				String str = new String(b);
				if(!str.equals("")){
					System.out.println("客户端发送过来的信息："+str);
					
					if(!str.equals("byebye")){
						List<Socket> sockets = ClientSocket.sockets;
						for(int i=0;i<sockets.size();i++){
							if(!sockets.get(i).equals(socket)){
								String[] strs = str.split("\\|");
								str = strs[0]+"说了:"+strs[2];
								out = sockets.get(i).getOutputStream();
								out.write(str.getBytes());
							}
						}
						
					}else{
						flag=false;
					}
					
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
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
