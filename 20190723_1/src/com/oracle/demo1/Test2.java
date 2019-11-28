package com.oracle.demo1;

import java.io.IOException;

/**
 * runtime：调用本机程序
 */
public class Test2 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        // 注意：命令必须配置到环境变量里命令才会有效,以下命令win下有效
        try {
            Process pro =  rt.exec("notepad.exe");
            Thread.sleep(5000);
            // 杀掉进程
            pro.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
