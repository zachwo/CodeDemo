package com.example.entity;

public class Computer  {
    /**
     *
     * @param usb
     */
    public void connUsb(USB usb){
        usb.connection();
        usb.transfor();
        usb.close();
    }
}
