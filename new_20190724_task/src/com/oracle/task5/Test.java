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

        File srcFile = new File(filePath+ File.separator+"a.txt");
        File destFile = new File(filePath+File.separator+"destFile");

        copyFile(srcFile,destFile);


    }

    /**
     *
     * @param srcFile 源文件
     * @param destFile 目标文件
     */
    public static void copyFile(File srcFile,File destFile){
        //复制文件的大前提是源文件存在
        if (srcFile.exists()){
            if (!destFile.exists()){
                destFile.mkdirs();
            }
            String destPath = destFile.getAbsolutePath();
            File file = new File(destPath+File.separator+srcFile.getName());
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
