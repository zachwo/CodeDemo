package com.oracle.task5;

import java.io.File;
import java.io.IOException;

/**
 * 5.写一个方法,可以复制一个文件（不要求复制文件的内容）
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task5";
        new File(filePath).mkdirs();

        File file1 = new File(filePath+ File.separator+"a.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File(filePath+File.separator+"a(copy).txt");
        
    }
}
