package com.oracle.Demo;

import java.io.*;

/**
 * 字符输入流Reader
 * Reader为抽象类，需要通过子类FileReader进行实例化对象
 */
public class Test4 {
    public static void main(String[] args) {
        File file  = new File(File.separator+"Users"+File.separator+"wangze"+
                File.separator+"a.txt");
        Reader in = null;
        try {
            in = new FileReader(file);
            //1.
//            char[] cs = new char[(int)file.length()];
//            int index = 0;
//            int temp = -1;
//            while ((temp = in.read())!=-1){
//                cs[index] = (char) temp;
//                index++;
//            }
            //2.
            char[] cs = new char[(int)file.length()];
            in.read(cs,0,5);

            String str = new String(cs);
            System.out.println(str);
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
        }

    }
}

















