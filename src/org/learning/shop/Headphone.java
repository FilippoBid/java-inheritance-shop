package org.learning.shop;

public class Headphone extends Product {
    private Boolean wireless;
    private Boolean cable;
    private String color;

    public Headphone(String name, String description, double price,int vat, Boolean wireless, Boolean cable, String color) {
        super(name,description,price,vat);
        this.wireless = wireless;
        this.cable = cable;
        this.color = color;
    }

    public Boolean getWireless() {
        return wireless;
    }
    public Boolean getCable() {
        return cable;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() + "wirless: " + wireless + "\n" + "cable: " + cable + "\n" + "color: " + color + "\n";

    }


}

