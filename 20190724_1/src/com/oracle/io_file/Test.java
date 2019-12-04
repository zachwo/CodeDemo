package com.oracle.io_file;

import java.io.File;
import java.io.IOException;

/**
 * File类练习
 */
public class Test {
    public static void main(String[] args) {
        String basepath = "/Users/wangze/JavaWorkspace/CodeDemo/20190724_1/src/file_practice";
        File file = new File(basepath+File.separator+"deme.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件删除成功");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
