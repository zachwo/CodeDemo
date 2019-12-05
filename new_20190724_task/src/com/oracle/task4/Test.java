package com.oracle.task4;

import java.io.File;

/**
 * 4.删除一个给定的目录,此目录不为空目录,使用递归来实现
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task4";
        new File(filePath).mkdirs();

        File file = new File(filePath+File.separator+"directory1");
        deleteFile(file);


    }
    public static void deleteFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (int i=0;i<files.length;i++){
                deleteFile(files[i]);
            }
            file.delete();
        }else {
            file.delete();
        }
    }
}
