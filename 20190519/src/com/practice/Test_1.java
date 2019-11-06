package com.practice;

import com.practice.entity.Adress;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println(new Adress("中国","黑龙江","哈尔滨","文政街","150000")
                            .getFullMessage());
    }
}
