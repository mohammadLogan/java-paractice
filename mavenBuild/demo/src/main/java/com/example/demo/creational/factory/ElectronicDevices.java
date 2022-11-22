package com.example.demo.creational.factory;

public class ElectronicDevices extends Calculate {

    public ElectronicDevices(int price, String product, int tax) {
        super(price, product, tax);
    }

    @Override
    public String calculate(int price, String product, int tax) {
       return (product + "= " + "price : " + price + " tax : " + tax +
                " final amount :" + (price + (price * tax / 100)));
    }
}
