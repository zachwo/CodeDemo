package com.oracle.task4;

/**
 * 4.给定下面的HTML代码
 * <font face”Arial,Serif” size=“+2” color=“red”
 * 要求对内容进行拆分，拆分后的结果为（解题思路：先拆分在替换）
 * face Arial Serif
 * Size +2
 * Color red
 */
public class Test {
    public static void main(String[] args) {
        String string = "<font face”Arial,Serif” size=“+2” color=“red”";
        //去除多余符号：
        string = string.replaceAll("[^a-zA-Z0-9+]"," ");
        //去除font标示&去除首尾多余空格：
        string = string.replace("font","").trim();
        //System.out.println(string);
        String[] strings = string.split(" +");
        for (String s:strings){
            if (s.equals("Serif")||s.equals("+2")||s.equals("red")){
                System.out.println(s);
            }else {
                System.out.print(s+" ");
            }
        }

    }
}
