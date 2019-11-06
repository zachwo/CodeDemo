package com.oracle.Demo;

import java.io.*;

/**
 * 字节输入流InputStream的使用
 * IutputStream是抽象类，不能直接用来创建字节输入流对象，字节输入流不光能读取字节类型的数据，也能读取字符类型的数据，
 * 只是需要将字符转变为字节
 */
public class Test1 {
    public static void main(String[] args) {
        read3();

    }
    //read1使用的最多，适合边读边写
    public static void read1(){
        //1.创建要读取的File类对象
        File file = new File(File.separator+"Users"+File.separator+"wangze"+
                File.separator+"stream.txt");
        //2.创建字节输入流对象
        InputStream in = null;
        try {
            in = new FileInputStream(file);//多态：子类类型向父类类型转换
            // 3.执行读取的操作
            //创建一个字节型数组，用来保存读取到的所有的字节，数组的长度就是字节输入流可以读取到的字节数
            byte[] b = new byte[in.available()];
            //定义一个变量代表数组下标
            int index = 0;
            //定义一个变量，这个变量代表每一次读取到的字节，默认值为-1
            int temp = -1;
            //便携循环读取输入
            while((temp = in.read())!=-1){
                b[index] = (byte)temp;
                index++;
            }
            //可以将字节数组转变为字符串
            String str = new String(b);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    //4.关闭流
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void read2(){
        //1.创建要读取的File类对象
        File file = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"stream.txt");
        //2.创建字节输入流对象
        InputStream in = null;
        try {
            in = new FileInputStream(file);//多态：子类类型向父类类型转换
            // 3.执行读取的操作
            //创建一个字节型数组，用来保存读取到的所有的字节，数组的长度就是字节输入流可以读取到的字节数
            byte[] b = new byte[in.available()];
            //调用方法
            in.read(b);
            //可以将字节数组转变为字符串
            String str = new String(b);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    //4.关闭流
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void read3(){
        //1.创建要读取的File类对象
        File file = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"stream.txt");
        //2.创建字节输入流对象
        InputStream in = null;
        try {
            in = new FileInputStream(file);//多态：子类类型向父类类型转换
            // 3.执行读取的操作
            //创建一个字节型数组，用来保存读取到的所有的字节，数组的长度就是字节输入流可以读取到的字节数
            byte[] b = new byte[in.available()];
            //调用方法
            in.read(b,0,5);
            //可以将字节数组转变为字符串
            String str = new String(b);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    //4.关闭流
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



























