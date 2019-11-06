package com.oracle.task6;

import javax.xml.transform.dom.DOMResult;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] names = {"科特迪瓦","阿根廷","澳大利亚","塞尔维亚","荷兰","尼日利亚","日本",
                "美国","中国","新西兰", "巴西","比利时","韩国","喀麦隆","洪都拉斯","意大利"};
        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<names.length;i++){
            list.add(names[i]);
        }
//        for (String name:list){
//            System.out.println(name);
//        }
        //打乱顺序：
        for (int i = 0;i<100;i++){
            int index1 = random.nextInt(list.size());
            int index2 = random.nextInt(list.size());

            String s = list.get(index1);
            list.set(index1,list.get(index2));
            list.set(index2,s);
        }
        System.out.println("打乱顺序后：\n");
//        for (int i = 0;i<list.size();i++){
//            System.out.println(list.get(i)+"\t在\t第"+(i/4+1)+"小组");
//        }
        for (int i=0;i<4;i++){
            System.out.println("第"+(i+1)+"组名单：");
            for(int j = i*4;j<i*4+4;j++){
                System.out.print(list.get(j)+"\t");
            }
            System.out.println("\n");
        }
    }
}

