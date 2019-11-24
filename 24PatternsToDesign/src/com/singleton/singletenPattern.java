package com.singleton;

/**
 * 24种设计模式之单例设计模式
 */
public class singletenPattern {
//    1.构造方法私有化，使得外界直接使用构造方法创建对象时被拒绝
    private singletenPattern(){

    }
//    2.在本类中定义一个静态的当前类类型的属性
    private static singletenPattern single = null;
//    3.在静态块中实例化该属性
    static{
        single = new singletenPattern();
    }
//    4.定义外界获取实例化后对象的getter方法
    public static singletenPattern getSingle(){
        return single;
    }

}
