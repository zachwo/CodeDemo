package com.oracle.task1;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"a.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("文件的字节大小为："+file.length());
            System.out.println("文件的绝对路径为："+file.getAbsolutePath());
            Date date = new Date(file.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("文件的最后修改时间为："+sdf.format(date));
        }
    }
}
