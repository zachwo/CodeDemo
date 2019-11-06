package com.oracle.demo5;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections(非Collection)工具类的应用
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list,"A","B","C","D","E");
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("反转集合");
        Collections.reverse(list);
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("查找位置");
        Collections.shuffle(list);//打乱顺序
        Collections.sort(list);//升序排列
        int index = Collections.binarySearch(list,"B");//二分法查找
        System.out.println(index);
        System.out.println("交换顺序");
        Collections.swap(list,0,3);//交换顺序
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("替换元素");
        Collections.fill(list,"P");
        for (String s:list){
            System.out.println(s);
        }


    }
}
