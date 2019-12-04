package com.oracle.io_file;

import java.io.File;
import java.io.IOException;

/**
 * File类练习
 */
public class Test {
    public static void main(String[] args) {
        String basepath = "/Users/wangze/JavaWorkspace/CodeDemo/20190724_1/src/file_practice";
//        文件练习
//        File file = new File(basepath+File.separator+"deme.txt");
//        if (file.exists()){
//            file.delete();
//            System.out.println("文件删除成功");
//        }else {
//            try {
//                file.createNewFile();
//                System.out.println("文件创建成功");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        文件夹练习
//        File file1 = new File(basepath+File.separator+"directory");
//        file1.mkdir();
//        File file2 = new File(basepath+File.separator+"directory1"+File.separator+"directory2");
//        file2.mkdirs();

//        文件夹删除练习
//        File file3 = new File(basepath+File.separator+"directory1");
//        deleteFile(file3);

    }

    /**
     * 因为delete()方法只能删除空文件夹或者文件，所以对于非空文文件夹需要遍历递归执行delete()方法
     * @param file 需要删除的文件路径
     */
    public static void deleteFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            //如果是非空文件夹，逐个循环递归执行deleteFile方法
            for (int i=0;i<files.length;i++){
                File f = files[i];
                deleteFile(f);
            }
            //如果是空文件夹，不参与for循环，直接执行删除操作
            file.delete();
        }else {
            //如果是非文件夹的文件，直接执行删除操作
            file.delete();
        }
    }

}
