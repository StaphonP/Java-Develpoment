package com.pluralsight;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;

        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Box");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 2:
                System.out.print("Enter the length of the square: ");
                double lengthS = scanner.nextDouble();
                System.out.println("Enter the width of the square: ");
                double widthS = scanner.nextDouble();
                shape = new Square(lengthS, widthS);
                break;
            case 3:
                System.out.print("Enter length of the box: ");
                length = scanner.nextDouble();
                System.out.print("Enter width of the box: ");
                width = scanner.nextDouble();
                System.out.print("Enter height of the box: ");
                double height = scanner.nextDouble();
                 shape = new Box(length, width, height);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        System.out.println("Area of the selected shape: " + shape.getArea());
    }
}
