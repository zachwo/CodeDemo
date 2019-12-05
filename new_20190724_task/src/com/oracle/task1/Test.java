package com.oracle.task1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 1.使用File,获得一个文件是否存在,如果不存在,则创建.如果存在,则显示这个文件的大小,路径,最后修改时间.
 */
public class Test {
    public static void main(String[] args) {
        String basePath = "/Users/wangze/JavaWorkspace/CodeDemo/new_20190724_task/src/file_practice";
        String filePath = basePath+File.separator+"task1";
        new File(filePath).mkdirs();
        File file = new File(filePath+File.separator+"a.txt");
        if (file.exists()){
            System.out.println("该文件已存在");
            System.out.println("文件大小："+file.length());
            System.out.println("文件路径："+file.getPath());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
            System.out.println("最后修改时间："+sdf.format(file.lastModified()));
        }else {
            try {
                file.createNewFile();
                System.out.println("新文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
