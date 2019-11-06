package com.oracle.task_6;

public class Worker extends Employee {
    private String category;
    private boolean dressAllowance;

    public Worker(String name, char sex, String category, boolean dressAllowance) {
        super(name, sex);
        this.category = category;
        this.dressAllowance = dressAllowance;
    }

    public boolean isDressAll(){
        return dressAllowance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDressAllowance() {
        return dressAllowance;
    }

    public void setDressAllowance(boolean dressAllowance) {
        this.dressAllowance = dressAllowance;
    }
}
