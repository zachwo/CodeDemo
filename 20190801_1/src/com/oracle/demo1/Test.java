package com.oracle.demo1;

import java.rmi.MarshalledObject;
import java.sql.Struct;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("baidu","www.baidu.com");
        map.put("baidu","www.baidu1.com");//key如果相同，后添加的value会把之前key对应的value替换
        map.put("taobao","www.taobao.com");
        map.put("sina","www.sina.com");

        System.out.println(map.get("taobao"));
        System.out.println(map.get("baidu"));

//        map.clear();//清空集合
//        System.out.println(map.get("taobao"));
//        System.out.println(map.size());

        System.out.println(map.containsKey("baidu"));//判断key是否存在
        System.out.println(map.containsValue("www.baidu1.com"));//判断value是否存在

        Set<String> set = map.keySet();
        for (String key:set){
            System.out.println(key);
        }

//        System.out.println();
//        map.remove("sina");
//        for (String key:set){
//            System.out.println(key);
//        }

//        Collection<String> con = map.values();
//        Iterator<String> iter = con.iterator();
//        while (iter.hasNext()){
//            String str = iter.next();
//            System.out.println(str);
//        }

        //map里存的是map.Entry
        //map.Entry里存的是key和value
        //通过entrySet得到这个集合set1，集合里存的都是map.entry,但是entry也需要制定范型（复合范型）
        //遍历这个集合的时候，集合的范型是什么迭代器的范型就是什么
        Set<Map.Entry<String,String>> set1 = map.entrySet();
        Iterator<Map.Entry<String,String>> iter = set1.iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
//            System.out.println(entry);
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }


    }
}
