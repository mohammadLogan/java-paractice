package com.example.demo.creational.factory;

public abstract class Calculate {

    private int price;
    private String product;
    private int tax;

    public Calculate(int price, String product, int tax) {
        this.price = price;
        this.product = product;
        this.tax = tax;
    }

    public abstract String calculate(int price, String product, int tax);
}
