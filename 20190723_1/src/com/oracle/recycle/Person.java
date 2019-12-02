package com.oracle.recycle;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * finalize
     *注意⚠️！！！该方法自jdk 9之后就被废弃了，之前的版本也不建议重写该Object方法实现某些功能！！！
     * protected void finalize()
     *                  throws Throwable
     * 当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。子类重写 finalize 方法，以配置系统资源或执行其他清除。
     */
    @Override
    public void finalize() {
        System.out.println(this.getName()+"被回收");
    }
}
