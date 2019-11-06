package com.oracle.Demo;

import java.io.*;

/**
 *字节输出流outputstream的应用
 * OutputStream是抽象类，不能直接用来创建字节输出流对象，字节输出流不光能输出字节类型的数据，也能输出字符类型的数据，
 * 只是需要将字符转变为字节
 */
public class Test2 {
    public static void main(String[] args) {
//     write1();
//     write2();
     write3();
    }

    public static void write1(){
        //1.创建要写入的File类对象
        File file = new File(File.separator+"Users"+File.separator+
                "wangze"+File.separator+"stream1.txt");
        //2.根据需要创建流
        OutputStream out = null;
        try {
            out = new FileOutputStream(file,true);//append设为true则不会覆盖内容
            //3.定义要输出的内容
            String str = "你好👋";
            out.write(str.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void write2(){
        //1.创建要写入的File类对象
        File file = new File(File.separator+"Users"+File.separator+
                "wangze"+File.separator+"stream1.txt");
        //2.根据需要创建流
        OutputStream out = null;
        try {
            out = new FileOutputStream(file,true);//append设为true则不会覆盖内容
            //3.定义要输出的内容
            String str = "hellojava";
            out.write(str.getBytes(),3,2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void write3 (){
        //1.创建要写入的File类对象
        File file = new File(File.separator+"Users"+File.separator+
                "wangze"+File.separator+"stream1.txt");
        //2.根据需要创建流
        OutputStream out = null;
        try {
            out = new FileOutputStream(file,true);//append设为true则不会覆盖内容
            //3.定义要输出的内容
            String str = "\nhellojava";
            byte[] b = str.getBytes();
            for (int i = 0 ; i<b.length ; i++){
                out.write(b[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




















