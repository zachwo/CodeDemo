package com.oracle.demo7;

import java.util.ArrayList;
import java.util.List;

public class ClassNum {
    private String name;
    private List<Student> stus;
    public ClassNum() {
    }

    public ClassNum(String name) {
        this.name = name;
        stus = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
