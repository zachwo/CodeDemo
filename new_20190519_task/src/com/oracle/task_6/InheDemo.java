package com.oracle.task_6;

public class InheDemo {
    public static void main(String[] args) {
        Worker worker = new Worker("张三",'M',"工程师",false);
        if(worker.isDressAll()){
            System.out.println(worker.getName()+"有服装津贴");
        }else{
            System.out.println(worker.getName()+"没有服装津贴");
        }
    }
}
