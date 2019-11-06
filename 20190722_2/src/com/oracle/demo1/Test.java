package com.oracle.demo1;

public class Test {
    public static void main(String[] args) {
        //当创建对象的时候指定范型类型
        Point<Integer,String > point = new Point<Integer,String >(19,"北纬19度");

        Integer in =  point.getX();
        String str = point.getY();
        System.out.println(in);
        System.out.println(str);
    }
}
