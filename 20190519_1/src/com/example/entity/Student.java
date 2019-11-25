package com.example.entity;

public class Student extends Person {
    private String school;

    public Student() {
        //系统默认调用父类的无参构造器，所以当父类有无参构造器时super()写与不写效果一样，但是如果父类只有有参构造器就必须显式声明:
        //super("李四",19);
        System.out.println("Student被创建了");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    //重写父类的getInfo方法
    public String getInfo(){
        return "姓名："+this.getName()+"，年龄："+this.getAge()+"，学校："+this.getSchool();
    }
}
