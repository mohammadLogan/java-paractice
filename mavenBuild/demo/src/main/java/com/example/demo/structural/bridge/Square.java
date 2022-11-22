package com.example.demo.structural.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Square ");
    }

    @Override
    void applyColor() {
        getColor().applyColor();
    }

}
