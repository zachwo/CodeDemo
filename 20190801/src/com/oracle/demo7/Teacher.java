package com.oracle.demo7;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Student> stus;

    public Teacher(String name) {
        this.name = name;
        this.stus = new ArrayList<>();
    }

    public Teacher() {
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
        return this.name;
    }
}
