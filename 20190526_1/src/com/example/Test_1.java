package com.example;

import com.example.entity.A;
import com.example.entity.B;
import com.example.entity.C;

public class Test_1 {
    public static void main(String[] args) {
        B b = new B();
        A a = b;//向上转型
        a.fun1();//fun1()调用fun(),fun()被B重写，所以输出结果为B-->fun而不是A-->fun

        A a1 = new B();
        B b1 = (B) a1;
        b.fun();

        //以下写法报错，
//        A a2 = new B();
//        C c = (C) a2;
//        c.fun();

        //多态的用途
        System.out.println("对象的多态性的应用：");
        test(new A());
        test(new B());
        test(new C());

    }

    /**
     *
     * @param x x可以为父类A的任何一个子类，且fun()方法会根据不同子类的重写而输出不同的结果，缺点是如果不用instanceof关键字就只能调用共有的方法
     */
    public static void test (A x){
        x.fun();

        if(x instanceof B){//表明x 是由B上转型而来
            B b = (B) x;//下转型回B
            b.fun2();
        }else if(x instanceof C){
            C c = (C) x;
            c.fun3();
        }
    }
}
