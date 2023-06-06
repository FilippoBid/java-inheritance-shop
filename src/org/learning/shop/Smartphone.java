package org.learning.shop;

public class Smartphone extends Product {
    private String IMEI;
    private int storage;

    public Smartphone(String name, String description, double price,int vat, String IMEI, int storage) {
        super(name,description,price,vat);
        this.IMEI = IMEI;
        this.storage = storage;
    }

    public String getIMEI() {
        return IMEI;
    }

    public int getStorage() {
        return storage;
    }
    public String toString() {
        return super.toString() + "IMEI: " + IMEI + "\n" + "Storage: " + storage + "\n";

    }


}
