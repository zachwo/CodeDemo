package com.oracle.demo1;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        try {
            Inet4Address i1 = (Inet4Address) Inet4Address.getByName("localhost");
            Inet4Address i2 = (Inet4Address) Inet4Address.getByName("www.baidu.com");
            //以字符串形式获取本机ip地址
            String ip =  i1 .getHostAddress();
            //获取百度的ip地址
            String ipBaidu = i2.getHostAddress();
            System.out.println(ip);
            System.out.println(ipBaidu);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
