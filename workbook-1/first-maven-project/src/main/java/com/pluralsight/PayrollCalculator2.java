package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {


    public static void main(String[] args) {
        String Name;
        int hours;
        int payRate;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter name here: ");
        Name = myScanner.next();

        System.out.print("Enter hours worked: ");
        hours = myScanner.nextInt();

        System.out.print("Enter pay rate: ");
        payRate = myScanner.nextInt();

        System.out.print("The answer is: " + hours * payRate);

        }



    }

