package com.oracle.task2;

import java.io.File;

/**
 * 2.创建一个多层目录 "f:/java/java1/java2"
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task2"+
                File.separator+"java"+File.separator+"java1"+
                File.separator+"java2";
        new File(filePath).mkdirs();

    }
}
