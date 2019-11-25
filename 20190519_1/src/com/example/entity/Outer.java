package com.example.entity;

public class Outer {
    private String info;

    public Outer() {
    }

    public Outer(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    //定义内部类
    public class Inner{
        private String name;
        //内部类里再定义一个外部类同名属性
        private String info;

        public Inner() {
        }

        public Inner(String name, String info) {
            this.name = name;
            this.info = info;
        }
        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        //内部类里编写一个普通方法
        //就近访问原则，范围小会把范围大的覆盖，所以如果内部类有和外部类同名的属性，则会默认调用内部类中的属性
        public void func(){
            //如果想调用外部类的同名属性或方法，用Outer.this.XXX
            System.out.println("名字："+this.getName()+"\tOuter's info:"+Outer.this.info+"\tInner's info:"+info);
        }
    }
}
