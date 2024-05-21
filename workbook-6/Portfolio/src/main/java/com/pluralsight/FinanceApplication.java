package com.pluralsight;

import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your Portfolio");
        System.out.println("What would you like to add? \n" +
                "Bank Account(1)\nCreditCard(2)\nGold(3)\nHouse(4)\nJewelry(5)");
        int command = input.nextInt();
        switch (command) {
            case 1:
                System.out.println();
        }



    }
}
