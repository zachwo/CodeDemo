package com.oracle.demo2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Person,String> map = new TreeMap<>();
        map.put(new Person("张三",19),"www.baidu1.com");
        map.put(new Person("李四",18),"www.baidu.com");//key如果相同，后添加的value会把之前key对应的value替换
        map.put(new Person("王五",20),"www.taobao.com");
        map.put(new Person("赵六",19),"www.sina.com");

        Set<Map.Entry<Person,String>> set1 = map.entrySet();
        Iterator<Map.Entry<Person,String>> iter = set1.iterator();
        while (iter.hasNext()){
            Map.Entry<Person,String> entry = iter.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}

