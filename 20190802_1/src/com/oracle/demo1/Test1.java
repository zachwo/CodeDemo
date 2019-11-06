package com.oracle.demo1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class Test1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http","www.baidu.com","/img/bd_logo1.png");
            InputStream in =  url.openStream();
            OutputStream out = new FileOutputStream(new File("/Users/wangze"+File.separator+"a.png"));
            int temp = -1;
            while ((temp = in.read()) != -1){//从输入流中读取数据的下一个字节，当数据全部读取完毕之后in.read()值等于-1
                System.out.println("in.read当前值："+temp);
                out.write(temp);
            }
            System.out.println("数据全部读取后的in.read值："+temp);
            in.close();
            out.close();

            URLConnection connection = url.openConnection();
            System.out.println("文件长度："+connection.getContentLength());  //输出文件长度
            System.out.println("文件类型："+connection.getContentType());    //输出文件类型

//            InputStream in1 =  connection.getInputStream();
//            byte[] b= new byte[in1.available()];
//            in1.read(b);
//            String str = new String(b);
//            System.out.println(str);
//            in1.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
