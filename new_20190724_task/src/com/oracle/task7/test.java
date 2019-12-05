package com.oracle.task7;

import java.io.File;

/**
 * 7.写一个方法,可以将一个非空目录中的所有文件的层次显示出来；
 */
public class test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task7";
        new File(filePath).mkdirs();

        File file = new File(filePath+File.separator+"directory1");
        printFilePath(file);
    }

    public static void printFilePath(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (int i=0;i<files.length;i++){
                printFilePath(files[i]);
            }
            System.out.println(file.getAbsolutePath());
        }else {
            System.out.println(file.getAbsolutePath());
        }
    }
}
