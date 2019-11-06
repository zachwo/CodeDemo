package com.oracle.code1;

public class Single {
    //2.定义一个静态的当前类类型的属性
    private static Single single= null;
    //3.静态块中实现本类类型的属性
    static{
        single = new Single();
    }
    //1.构造方法私有化
    private Single(){

    }
    //提供静态方法返回本类类型的属性
    public static Single getSingle() {
        return single;
    }
}
