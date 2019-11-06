package com.oracle.task_1;

public class Student extends Person {
    private String sex;

    public Student() {
    }

//    public Student(String name, int age,String sex) {
//        super(name,age);//父类属性采用有参数构造方法实现赋值
//        this.sex = sex;
//    }

    public Student(String name, int age,String sex) {
        super.setName(name);
        super.setAge(19);
        this.setSex(sex);
    }

    @Override
    public void showInfo() {
        System.out.println("姓名："+this.getName()+"\t性别："+this.getSex()+"\t年龄："+this.getAge());
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
