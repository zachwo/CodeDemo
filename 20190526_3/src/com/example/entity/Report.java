package com.example.entity;

public abstract class Report {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void target();
    public abstract void process();
    public abstract void result();
}
