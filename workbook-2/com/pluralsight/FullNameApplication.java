package com.pluralsight;


import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: " +
                "");
        String firstName = input.nextLine();
        System.out.println("Enter Middle Name ");
        String middleName = input.nextLine().toUpperCase();
        System.out.println("Enter your Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Suffix? ");
        String suffix = input.next().toUpperCase();
        String fullName = firstName + middleName + lastName;

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;

        }
        if (!(suffix.isEmpty())) {
            fullName = fullName + ", " + suffix;
        }


        System.out.println("Your Full Name is " +fullName);


    }
}








