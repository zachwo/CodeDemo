package com.oracle.demo3;

import java.util.Map;
import java.util.WeakHashMap;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new WeakHashMap<>();//弱引用
//        map.put(new String("A"),"A");
//        map.put(new String("B"),"B");
//        map.put(new String("C"),"C");
//        map.put(new String("D"),"D");

        map.put("A","A");
        map.put("B","B");
        map.put("C","C");
        map.put("D","D");
        System.gc(); //垃圾回收
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
