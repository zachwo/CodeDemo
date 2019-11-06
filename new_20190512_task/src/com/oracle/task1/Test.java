package com.oracle.task1;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student(2019001,"张三",92,89,95);
        double total = stu.getTotal();
        double avg = stu.getAvg();
        double max = stu.getMax();
        double min = stu.getMin();

        System.out.println(total);
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);

    }
}
