package com.pluralsight;

public class Square extends Rectangle {
    private double length;
    private double width;

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
       if (length == width) {
           return length * width;
       } else{
           System.out.println("Error! Not a Square");
       } return 0.0;
    }
}
