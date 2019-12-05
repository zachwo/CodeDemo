package com.oracle.task6;

import java.io.File;
import java.io.IOException;

/**
 * 6.写一个方法,可以复制一个目录,(此目录不为空，不要求复制文件的内容）)
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+ File.separator+"task6";
        new File(filePath).mkdirs();

        File srcFile = new File(filePath+File.separator+"directory1");
        File destFile = new File(filePath+File.separator+"destFile");
        copyDirectory(srcFile,destFile);
    }

    /**
     * 此方法同样适用于task5
     * @param srcFile
     * @param destFile
     */
    public static void copyDirectory(File srcFile,File destFile){
        if (srcFile.exists()){
            if (!destFile.exists()){
                destFile.mkdirs();
            }
            if (srcFile.isDirectory()){
                destFile = new File(destFile.getAbsolutePath()+File.separator+srcFile.getName());
                destFile.mkdirs();

                File[] files = srcFile.listFiles();
                for (int i = 0;i<files.length;i++){
                    copyDirectory(files[i],destFile);
                }
            }else {
                String destpath = destFile.getAbsolutePath();
                File file = new File(destpath+File.separator+srcFile.getName());
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
