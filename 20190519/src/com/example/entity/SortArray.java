package com.example.entity;

public class SortArray extends MyArray {

    public SortArray(int length) {
        super(length);
    }

    public void sort(){
        int[] array = this.getArray();
        for(int i=0;i<array.length-1;i++){
            for (int j =i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
