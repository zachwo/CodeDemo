package com.oracle.task2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Operator {
    public void printMap(Map<String,String> maps){
        Set<Map.Entry<String,String>> set = maps.entrySet();
        Iterator<Map.Entry<String,String>> iter = set.iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            System.out.println(entry.getKey()+"\t-->\t"+entry.getValue());
        }
    }
}
