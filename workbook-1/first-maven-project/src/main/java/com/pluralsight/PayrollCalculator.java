package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String Name;
        float hours;
        float payRate;
        System.out.print("Enter your Name");
        Name = myScanner.next();
        System.out.print("Enter Hours Worked");
        hours = myScanner.nextFloat();
        System.out.print("Enter pay rate");
        payRate = myScanner.nextFloat();
        System.out.print(hours * payRate);

        }
    }
