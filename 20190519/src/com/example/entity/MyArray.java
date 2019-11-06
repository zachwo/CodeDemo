package com.example.entity;

public class MyArray {
    //定义一个属性代表整型的一位数组
    private int[] array;
    //定义一个变量代表数组的下标
    private int index;

    public MyArray(int length) {
        if(length>0){
            array = new int[length];
        }else{
            array = new int[1];
        }
        index = 0;
    }

    /**
     * 添加数据
     * @param number
     */
    public void add(int number){
        if(index<array.length){
            array[index] = number;
            index++;
        }else{
         //如果旧数组超出了长度，我们就定义一个新的数组，新数组的长度是旧数组的长度+1
         int[] newArr = new int[array.length+1];
         //新创建的数组中没有值，我们应该将旧数组中的内容赋值给新数组
            for(int i=0;i<array.length;i++){
                newArr[i] = array[i];
            }
            //将本次添加的内容赋值给新数组的最后一位
            newArr[newArr.length-1]=number;
            //将新数组的内存地址赋值给旧数组
            array = newArr;
            //改变旧数组的下标
            index++;
        }
    }

    /**
     * 打印数据
     * @return
     */
    public void printArray(){
        for(int a : array){
            System.out.println(a);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
