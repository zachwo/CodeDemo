package com.example;

import com.example.entity.Outer;

public class Test_2 {
    public static void main(String[] args) {
        Outer out = new Outer("李四");
        Outer.Inner inner = out.new Inner("张三","王五");
        //等价于：
        //Outer.Inner inner = new Outer().new Inner("张三");
        inner.func();

        //方法外部访问不到方法内部类
        //InMethod in = new InMethod("小六");
        //只能直接使用方法
        fun1(19);
    }


    //在方法中定义内部类
    //jdk1.6及之后的版本可以直接访问参数（eg. age），
    //如果是之前的jdk版本，访问参数需要用final修饰参数（eg. public static void fun1(final int age)）
    public static void fun1(int age){
        class InMethod{
            private String name;

            public InMethod() {
            }

            public InMethod(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void fun(){

                System.out.println("这是一个方法内部类: "+this.getName()+"\tage: "+age);
            }
        }
        //方法内部可以访问到方法内部类
        InMethod in = new InMethod("小六");
        in.fun();
    }


}
