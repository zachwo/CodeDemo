package com.oracle.task1;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File(File.separator+"Users"+File.separator+"wangze"
                +File.separator+"b"+File.separator+"java"+File.separator+"java1"+File.separator+"java2");
        file.mkdirs();
    }
}
