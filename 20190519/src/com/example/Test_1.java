package com.example;

import com.example.entity.Person;

public class Test_1 {
    public static void main(String[] args) {
        Person[] pers = new Person[5];

        for( int i=0; i<pers.length; i++){
            System.out.println(pers[i]);
        }
        System.out.println();
        for(Person per: pers){
            System.out.println(per);
        }

        //对数组里的元素挨个实例化
        for(int i=0; i<pers.length; i++){
            pers[i] = new Person("Person"+i,19+i);
        }
        for(Person per: pers){
            System.out.println(per.getName()+"，年龄："+per.getAge());
        }
    }
}
