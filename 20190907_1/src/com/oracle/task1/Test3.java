package com.oracle.task1;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze" +File.separator+"b");
        for (int i = 0;i<500;i++){
            try {
                File.createTempFile("temp",".txt",file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
