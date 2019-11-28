package com.oracle.system_class;

/**
 * arraycopy
 *
 * public static void arraycopy(Object src,
 *                              int srcPos,
 *                              Object dest,
 *                              int destPos,
 *                              int length)
 * 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 * 从 src 引用的源数组到 dest 引用的目标数组，数组组件的一个子序列被复制下来。
 * 被复制的组件的编号等于 length 参数。源数组中位置在 srcPos 到 srcPos+length-1
 * 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] newArray = new int[array.length];
        // 获取当前时间
        long start = System.currentTimeMillis();
        // System.exit(0);终止当前Java虚拟机
        System.arraycopy(array,0,newArray,0,array.length);
        for (int a:newArray){
            System.out.println(a);
        }

        long end = System.currentTimeMillis();
        System.out.println("当前程序耗时"+(end-start)+"毫秒");
        System.out.println(start);
        System.out.println(end);

    }
}
