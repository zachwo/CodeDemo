package com.oracle.task6;

import java.io.File;

/**
 * 6.写一个方法,可以复制一个目录,(此目录不为空，不要求复制文件的内容）)
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task6";
        new File(filePath).mkdirs();

        File file = new File(filePath+File.separator+"directory1");
    }
}
