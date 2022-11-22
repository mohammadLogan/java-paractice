package com.example.demo.structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        new Circle(new Blue()).state();
        new Square(new Red()).state();
    }
}
