package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
     System.out.print("Please enter your name(First,Last or First,Middle,Last: ");
     Scanner input = new Scanner(System.in);
     String fullName = input.nextLine();
     String[] parts = fullName.split(" ");
     if (parts.length==2){
            System.out.println("First name: " + parts[0]);
            System.out.println("Middle Name: (none)");
            System.out.println("Last Name: " + parts[1]);
        } else if (parts.length==3){
            System.out.println("First Name: "+parts[0]);
            System.out.println("Middle Name: "+parts[1]);
            System.out.println("Last Name: "+parts[2]);
     }



    }
}
