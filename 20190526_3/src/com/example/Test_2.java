package com.example;

import com.example.entity.Computer;
import com.example.entity.Flash;
import com.example.entity.Phone;

public class Test_2 {
    public static void main(String[] args) {
        Computer cp = new Computer();
        Phone phone = new Phone();
        Flash flash = new Flash();
        cp.connUsb(flash);
        System.out.println();
        cp.connUsb(phone);


    }
}
