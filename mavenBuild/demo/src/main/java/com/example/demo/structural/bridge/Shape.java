package com.example.demo.structural.bridge;

public abstract class Shape {

    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    abstract void draw();

    abstract void applyColor();

    public  void state(){
        draw();
        applyColor();
    }
}
