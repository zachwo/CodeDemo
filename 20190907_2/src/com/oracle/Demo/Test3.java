package com.oracle.Demo;

import java.io.*;

/**
 * 用字节输入输出流复制文件的练习
 */
public class Test3 {
    public static void main(String[] args) {
        File srcFile = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"a.txt");
        File desFile = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"b.txt");
        copyFile(srcFile,desFile);
    }
    public static void  copyFile(File srcFile, File desFile){
        //1.创建字节输入流以及字节输出流
        InputStream in = null;
        OutputStream out = null;
        //2.实例化输入流以及输出流对象
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(desFile);

            //执行方式1：先读再输出（不推荐）
//            byte[]  b = new byte[in.available()];
//            in.read(b);
//            out.write(b);

            //执行方式2:边读编写
            int temp = -1;
            while ((temp=in.read())!=-1){
                out.write(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
