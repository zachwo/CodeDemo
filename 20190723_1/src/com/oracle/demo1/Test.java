package com.oracle.demo1;

public class Test {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("回收内存之前：");
        System.out.println("JVM空闲的内存："+rt.freeMemory());
        System.out.println("JVM的总体内存："+rt.maxMemory());
        // 运行垃圾回收器：
        // 备注：可能是由于macOS的内存回收管理机制不同与windows，运行垃圾回收器之后的可用内存反而减少，具体原因暂时未知
        rt.gc();
        System.out.println("回收内存之后：");
        System.out.println("运行垃圾回收器之后JVM的空闲内存："+rt.freeMemory());
        System.out.println("JVM的总体内存："+rt.maxMemory());


    }
}
