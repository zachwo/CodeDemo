package com.example.entity;

public class ReverseArray extends MyArray {
    public ReverseArray(int length) {
        super(length);
    }

    public void reverse(){
        int[] array = this.getArray();
        int[] newArr = new int[array.length];
        for(int i=0;i<array.length;i++){
            newArr[i] = array[array.length-1-i];
        }
        //array = newArr;
        this.setArray(newArr);
    }
}
