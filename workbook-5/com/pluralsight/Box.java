package com.pluralsight;

public class Box extends Rectangle {
private double height;
private double length;
private double width;
    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
