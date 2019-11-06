package com.oracle.demo4;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SortedMap的应用
 */
public class Test {
    public static void main(String[] args) {
        SortedMap<String,String> map = new TreeMap<>();

        map.put("b","B");
        map.put("a","A");
        map.put("c","C");
        map.put("d","D");

        System.out.println(map.firstKey());

//        map = ((TreeMap<String, String>) map).headMap("c");
        map = map.subMap("b","c");
        for (Map.Entry<String,String> en: map.entrySet()){
            System.out.println(en.getKey()+"-->"+en.getValue());
        }
    }
}
