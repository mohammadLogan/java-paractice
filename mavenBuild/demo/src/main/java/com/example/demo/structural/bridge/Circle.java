package com.example.demo.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }

    @Override
    void applyColor() {
        getColor().applyColor();
    }
}
