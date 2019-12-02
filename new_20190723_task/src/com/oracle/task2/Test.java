package com.oracle.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2.打印当前日期的时间戳
 * eg.20190723151910111
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

        System.out.println("时间戳："+simpleDateFormat.format(date));
    }
}
