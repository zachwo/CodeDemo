package com.oracle.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.打印当前的年月日时分秒毫秒 使用Calendar类完成
 * 2019年07月23日 15时19分10秒 111毫秒
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        String str = sdf.format(date);
        System.out.println(str);
    }
}
