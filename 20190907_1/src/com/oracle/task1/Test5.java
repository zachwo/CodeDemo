package com.oracle.task1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze" +
                File.separator+"Movies"+File.separator+"03.2020年恋练有词(绿皮)" );
        if (file.exists()){
            printFilePath(file);
        }else{
            System.out.println("文件夹不存在");
        }
    }

    public static void printFilePath(File file){
        if (!file.isDirectory()){
            System.out.println(file.getAbsolutePath());
        }else{
            System.out.println(file.getAbsolutePath());
            File[] files =  file.listFiles();
            for (File f: files){
                printFilePath(f);
            }
        }
    }
}
