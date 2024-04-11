package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int fNum;
        int sNum;
        System.out.println("What size sandwich would you like? 1 or 2?\n 1. Regular -$5.45\n 2. Large - $8.95");
        fNum = myScanner.nextInt();

        if (fNum == 1) {
            System.out.println("Meal price - $5.45");
        } else if (fNum == 2) {
            System.out.println("Meal price - $8.95");
        }
        System.out.println("How old are you?");
        sNum = myScanner.nextInt();
        ;
        double mealPrice1 = 5.45;
        double mealPrice2 = 8.95;
        double age = 0;
        double finalPrice = 0;
        if (sNum <= 17 && fNum == 1) {
            finalPrice = (mealPrice1 - (mealPrice1 * .10));
        } else if (sNum <= 17 && fNum == 2) {
            finalPrice = (mealPrice2 - (mealPrice2 * .10));
        } else if (sNum >= 65 && fNum == 1){
            finalPrice = (mealPrice1 - (mealPrice1 * .20));
        } else if (sNum >= 65 && fNum == 2){
            finalPrice = (mealPrice2 - (mealPrice2 * .20));
        }
        System.out.println("Final price: " + finalPrice);








        }



    }

