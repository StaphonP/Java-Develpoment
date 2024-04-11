package com.pluralsight;

import java.util.Scanner;

public class RentalCarShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for Pickup date.
        String pickUp;
        System.out.print("Pickup Date: ");
        pickUp = input.nextLine();
        //Number of days renting.
        int days;
        System.out.print("How many days are you renting?: ");
        days = input.nextInt();
        //Do they want a toll tag
        String toll;
        System.out.print("Toll tag? ($3.95/day)\n Y or N?: ");
        toll = input.next();

        //Do they want gps?
        String gps;

        System.out.print("Do you want GPS? ($2.95/day)\n Y or N?: ");
        gps = input.next();
        // Do they want Roadside Assistance?
        String road;
        System.out.print("Would you like Roadside Assistance? ($3.95/day)\n Y or N?: ");
        road = input.next();
        //Age
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        //Basic car rental
        double tollPrice = 0;
        double roadPrice = 0;
        double gpsPrice = 0;

        if (toll.equals("Y")) {
            tollPrice = (3.95 * days);
            System.out.print("Toll added\n");
        }

        if (gps.equals("Y")) {
            gpsPrice = (2.95 * days);
            System.out.print("GPS added\n");
        }

        if (road.equals("Y")) {
            roadPrice = (3.95 * days);
            System.out.print("Roadside Assistance added\n");
        }

        double basePrice = (days * 29.99);
        double choicePrice = tollPrice + roadPrice + gpsPrice;
        double finalPrice = choicePrice + basePrice;

        if (age < 25) {
            finalPrice *= 1.30;
            System.out.print("30% Surcharge will be added to your bill because you are not at least 25\n");
        }

        System.out.print("Your total is estimated to be: " + finalPrice);

    }
}
