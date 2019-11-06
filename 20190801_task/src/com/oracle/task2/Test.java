package com.oracle.task2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[][] str = {{"Tom","CoreJava"},{"John","Oracle"},{"Susan","Oracle"},
                {"Jerry","JDBC"},{"Jim","Unix"},{"Kevin","JSP"},{"Lucy","JSP"}};
        Map<String,String> maps = new HashMap<>();
        Operator op = new Operator();
        for (int i = 0;i<str.length;i++){
            maps.put(str[i][0],str[i][1]);
        }
        System.out.println("\n遍历老师&课程Map：");
        op.printMap(maps);

        System.out.println("\n添加新老师：");
        maps.put("Allen","JDBC");
        op.printMap(maps);

        System.out.println("\n修改Lucy老师的课程：");
        maps.put("Lucy","CoreJava");
        op.printMap(maps);

        System.out.println("\n教JSP的老师如下：");
        for (Map.Entry<String,String> entry:maps.entrySet()){
            if (entry.getValue().equals("JSP")){
                System.out.println(entry.getKey());
            }
        }


    }
}
