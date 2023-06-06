package org.learning.shop;

public class Television extends Product {
    private Boolean smart;
    private int screenSize;

    public Television(String name, String description, double price,int vat,String idCode, Boolean smart, int screenSize) {
        super(name,description,price,vat);
        this.smart = smart;

        this.screenSize = screenSize;
    }

    public Boolean getSmart() {
        return smart;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String toString() {
        return super.toString() + "Smart: " + smart + "\n" + "Screen size : " + screenSize + "\n";

    }



}

