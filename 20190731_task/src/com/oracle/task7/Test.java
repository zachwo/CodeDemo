package com.oracle.task7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tom",18,100,"class05"));
        list.add(new Student("Jerry",22,70,"class04"));
        list.add(new Student("Owen",25,90,"class05"));
        list.add(new Student("Jim",30,80,"class05"));
        list.add(new Student("Steve",28,66,"class06"));
        list.add(new Student("Kevin",24,100,"class04"));

        int sumAge=0;
        for (int i = 0;i<list.size();i++){
            sumAge+=list.get(i).getAge();
        }
        double avgAge = sumAge/list.size();
        System.out.println("所有学生的平均年龄为"+avgAge);


        Set<String> set = new HashSet<String>();
        for (Student s : list){
            set.add(s.getClassNum());
        }
        for(String classNum:set){
            double scoreSum = 0.0;
            int stuNum = 0;
            for (Student stu:list){
                if (classNum.equals(stu.getClassNum())){
                    scoreSum+=stu.getScore();
                    stuNum++;
                }
            }
            System.out.println(classNum+"的平均分是："+(scoreSum/stuNum));
        }

    }
}
