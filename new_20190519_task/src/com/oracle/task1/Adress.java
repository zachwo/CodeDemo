package com.oracle.task1;

public class Adress {
    private String country;
    private String province;
    private String city;
    private String street;
    private String code;

    public Adress() {
    }

    public Adress(String country, String province, String city, String street, String code) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.code = code;
    }

    @Override
    public String toString() {
        return this.country+this.province+this.city+this.street+this.code;
    }
}
