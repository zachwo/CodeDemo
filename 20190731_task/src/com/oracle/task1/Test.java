package com.oracle.task1;


import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Students stu1 = new Students("刘德华",85);
        Students stu2 = new Students("张学友",100);
        Students stu3 = new Students("刘杰",65);
        Students stu4 = new Students("章子怡",58);
        Students stu5 = new Students("周迅",76);

        LinkedList<Students> students = new LinkedList<Students>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        Operator op = new Operator();
        System.out.println("学生人数为："+op.countStudents(students));


        System.out.println("删除前：");
        for (Students s : students){
            System.out.println(s);
        }
//        students.remove(stu3);
        Iterator<Students> iter = students.iterator();
        while (iter.hasNext()){
            if(iter.next().getName().equals("刘杰")){
                iter.remove();
            }        }
        System.out.println("\n删除后：");
        for (Students s : students){
            System.out.println(s);
        }


        System.out.println("\n修改刘德华分数后：");
        iter = students.iterator();
        while (iter.hasNext()){
            int index = students.indexOf(iter.next());
            Students stu = students.get(index);

            if(stu.getName().equals("刘德华")){
                stu.setScore(95);
                students.set(index,stu);
            }
        }

        System.out.println("\n修改刘德华的分数后：（老师的方法）");
        iter = students.iterator();
        while(iter.hasNext()){
            Students stu = iter.next();
            if(stu.getName().equals("刘德华")){
                stu.setScore(95);
            }
        }

        for (Students s:students){
            System.out.println(s);
        }


        System.out.println();
        iter = students.iterator();
        while (iter.hasNext()){
            int index = students.indexOf(iter.next());
            Students stu = students.get(index);

            if(stu.getScore()<60){
                System.out.println(stu.getName()+"成绩不及格");
            }
        }

        System.out.println("打印不及格（老师的方法）");
        iter = students.iterator();
        while(iter.hasNext()){
            Students stu = iter.next();
            if(stu.getScore()<60){
                System.out.println(stu.getName());
            }
        }

    }
}
