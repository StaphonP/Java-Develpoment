package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Declare Variables Here
        //then code solution
        //then use System.out.println() to display results
        // ex: System.out.println("the answer is" + answer);
        int bobSalary = 40000;
        int garySalary = 50000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        int carPrice = 80000;
        int truckPrice = 40000;
        int lowerPrice = Math.min(carPrice, truckPrice);
        System.out.println("The answer is: " + lowerPrice);

        // Area pi * r^2
        double radius = 7.5;
        double pi = Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + area);

        double num = 5.0;
        double sq = Math.sqrt(5.0);
        System.out.println("The square root is: " + sq);

        double var = -3.8;
        double absolute = Math.abs(var);
        System.out.println("The absolute value is: " + absolute);

        int upperBound = 1;
        int lowerBound = 0;
        int rand =(int)Math.random() / (upperBound - lowerBound);
        System.out.println("The random number is: " + rand);

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt((x2 - x1) * (x2-x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance from these two points are: " + String.format("%.2f",distance));









    }
}
