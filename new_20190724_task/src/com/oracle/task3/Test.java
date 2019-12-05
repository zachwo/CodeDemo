package com.oracle.task3;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * 3.File类,自学createTempFile方法的使用,在一个目录中，创建500个临时文件；
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task3";
        new File(filePath).mkdirs();
        File file = new File(filePath);
        for (int i = 0;i<500;i++){
            try {
                File.createTempFile("windows",".exe", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
