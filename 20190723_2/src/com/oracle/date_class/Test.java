package com.oracle.date_class;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        // 等效于：
        // Date date = new Date(System.currentTimeMillis());
        System.out.println("默认date类对象的输出格式（当前时间）："+date);
        System.out.println("date类对象起始时间："+new Date(1));
        System.out.println();
        //Calendar类,抽象类，需要子类去继承实现，或者直接通过子类的向上转型来创建对象
        Calendar calendar = new GregorianCalendar();
        System.out.println("获取当前年："+calendar.get(Calendar.YEAR));
        System.out.println("获取当前月："+(calendar.get(Calendar.MONTH)+1)+" 注：国外的月份从0开始，所以转换为国内的习惯应该加1");
        System.out.println("获取当前日："+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("获取当前星期几："+(calendar.get(Calendar.DAY_OF_WEEK)-1)+" 注：国外的一周从周日开始，所以转换为国内的习惯应该减1");
        System.out.println("获取当前是这的月的第几周："+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("获取当前日是今年的第几天："+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("获取时："+calendar.get(Calendar.HOUR));
        System.out.println("获取时（24进制）："+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("获取分："+calendar.get(Calendar.MINUTE));
        System.out.println("获取秒："+calendar.get(Calendar.SECOND));
        System.out.println("获取毫秒："+calendar.get(Calendar.MILLISECOND));
        System.out.println();
        //SimpleDateFormate类，格式转换
        Date date1 = new Date();
        System.out.println("Date原始输出格式："+date1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 把date对象转换为字符串：
        String str = simpleDateFormat.format(date1);
        System.out.println(str);
        System.out.println();
        // 把字符串转换为默认的date对象:
        String str1 = "2001-01-01";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date2 = simpleDateFormat1.parse(str1);
            System.out.println(date2);
            //再转换为自定义的格式：
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            String str2 = simpleDateFormat2.format(date2);
            System.out.println(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
