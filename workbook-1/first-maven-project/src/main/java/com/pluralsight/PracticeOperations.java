package com.pluralsight;



public class PracticeOperations {
    public static void main(String[] args) {
        String firstName = "Staphon";
        String middleNAme = "Deandre";
        String lastName = "Peterson";
        String fullName = "firstName" + "middleNAme" + "lastName";
        //Full Name Result
        System.out.println(fullName);
        double newCar = 150;
        double carTax = 10;
        double gasBill = 5;
        double result;
        result = newCar + carTax + gasBill;
        System.out.println(result);
        result = newCar - carTax - gasBill;
        System.out.println(result);
        result = newCar * carTax * gasBill;
        System.out.println(result);
        result = newCar / carTax / gasBill;
        System.out.println(result);
        double accumulation = result + 10;
        System.out.println(accumulation);
        accumulation = accumulation + 100; // accumulation means adding to what is already there//
        System.out.println(accumulation);
        accumulation = accumulation + 1000;
        System.out.println(accumulation);

    }

    public static void practice(String[] arg) {
        double price = 0;
        double age = 0;
        if (age <= 10) {
            price = 5.00;
        } else if (age < 18) {
            price = 10.00;
        } else if (age <= 50) {
            price = 20.00;
        } else {
            price = 15.00;
        }
        System.out.println("Price of admission: ");


    }

    public static void Generations(String[] arg) {



    }
}

