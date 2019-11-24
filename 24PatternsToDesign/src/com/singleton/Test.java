package com.singleton;

public class Test {
    public static void main(String[] args) {
        singletenPattern single = singletenPattern.getSingle();
        System.out.println(single);
        singletenPattern single1 = singletenPattern.getSingle();
        System.out.println(single1);
        singletenPattern single2 = singletenPattern.getSingle();
        System.out.println(single2);
        singletenPattern single3 = singletenPattern.getSingle();
        System.out.println(single3);
        singletenPattern single4 = singletenPattern.getSingle();
        System.out.println(single4);

        System.out.println("查看地址能够发现：无论创建多少对象，都是同一个对象");

    }
}
