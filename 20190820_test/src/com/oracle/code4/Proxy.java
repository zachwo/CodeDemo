package com.oracle.code4;

public class Proxy implements Person {
    private Teacher teacher;

    @Override
    public String activity() {
        if (teacher == null){
            teacher = new Teacher("李四",35);
        }
        return teacher.activity();
    }


}
