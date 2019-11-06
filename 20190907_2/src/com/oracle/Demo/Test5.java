package com.oracle.Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *字符输出流Wirter
 */
public class Test5 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"writer.txt");
        Writer  out = null;
        try {
            out = new FileWriter(file,true);
            String str = "writer1";

//            out.write(str);//方法1
//            out.write(str.toCharArray());//方法2
             char[] cs = str.toCharArray();//方法3
             for (int i=0; i<cs.length;i++){
                 out.write(cs[i]);
             }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
