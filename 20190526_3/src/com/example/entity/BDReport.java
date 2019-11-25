package com.example.entity;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class BDReport extends Report{
    public BDReport(String name) {
        this.setName(name);
    }

    @Override
    public void target() {
        System.out.println(this.getName()+"的目的是学习大数据，以后称为大数据程序员");
    }

    @Override
    public void process() {
        System.out.println("先学Java再学大数据");
    }

    @Override
    public void result() {
        System.out.println("Java没学好，大数据也废了");
    }
}
