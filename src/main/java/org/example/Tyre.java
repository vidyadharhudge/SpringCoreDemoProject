package org.example;

public class Tyre {

    private String brand;//he property ahe means yala dependency lagte  bike and car madhe  variable use nahi karat
/*
    public Tyre(String brand) {
        super();
        this.brand = brand;
    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
       /* return "Type[brand=" +brand +"]";*/
        return "Its working ...";
    }
}
