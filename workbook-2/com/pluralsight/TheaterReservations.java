package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name: ");//User name input
        String name = input.nextLine();

        String[] nameParts = name.split(" ");//Split the name and make their variables
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("Reservation date: "); //user date input
        String date = input.nextLine();
        String[] dateParts = date.split("/");

        System.out.print("How many tickets: ");// User ticket number input
        int ticketNum = input.nextInt();

        if (ticketNum == 1){
            System.out.println(ticketNum + "ticket reserved for " + date + " under " + lastName +","+ firstName);
    } else if (ticketNum > 1){
        System.out.print(ticketNum+ " tickets reserved for "+date+" under "+lastName +"," +firstName);}

        }




    }

