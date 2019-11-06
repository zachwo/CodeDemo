package com.oracle.task1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze" +File.separator+"b");
        deleteFiles(file);

    }
    public static void deleteFiles(File file){
        if (!file.isDirectory()){
            file.delete();
        }else{
            File[] files = file.listFiles();
            for (File f:files){
                deleteFiles(f);
            }
            file.delete();
        }
    }
}
