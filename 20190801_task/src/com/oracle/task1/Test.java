package com.oracle.task1;

import java.time.temporal.TemporalAmount;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[][] strs = {{"1930","乌拉圭"},{"1934","意大利"},{"1938","意大利"},{"1950","乌拉圭"},{"1954","德国"},
                {"1958","巴西"}, {"1962","巴西"},{"1966","英格兰"},{"1970","巴西"},{"1974","德国"},{"1978","阿根廷"},
                {"1982","意大利"}, {"1986","阿根廷"},{"1990","德国"},{"1994","巴西"},{"1998","法国"}, {"2002","巴西"},
                {"2006","意大利"},{"2010","西班牙"}, {"2014","德国"}, {"2018","法国"}};
        Map<String,String> maps = new HashMap<>();
        for (int i = 0;i<strs.length;i++){
            maps.put(strs[i][0],strs[i][1]);
        }

//        Set<Map.Entry<String,String>> set = maps.entrySet();
//        Iterator<Map.Entry<String,String>> iter = set.iterator();
//        while (iter.hasNext()){
//            Map.Entry<String,String> entry = iter.next();
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
//        }
        Scanner scanner = new Scanner(System.in);

        //task1
        System.out.println("请输入查询年份：");
        String year = scanner.nextLine();

        if (maps.containsKey(year)){
            System.out.println(maps.get(year)+"队获得了冠军");
        }else{
            System.out.println(year+"年没有举办世界杯");
        }

        //task2
        System.out.println("请输入查询球队：");
        String team = scanner.nextLine();
        if (maps.containsValue(team)){
            List<String> years = new ArrayList<>();
            for (Map.Entry<String,String> entry:maps.entrySet()){
                if(entry.getValue().equals(team)){
                   years.add(entry.getKey());
                }
            }
            Collections.sort(years);
            System.out.println(team+"队夺冠年份如下：");
            for (String s:years){
                System.out.println(s);
            }
        }else{
            System.out.println(team+"队没有获得过世界杯");
        }

    }
}
