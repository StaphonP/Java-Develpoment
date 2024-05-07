package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/* Create a method to log the actions of the user. Write each user action to a file
name logs.txt.
Actions include:
a. Launching the application
b. Searching for a term
c. Exiting the application
In the main() method prompt the user for a search term that they wish to
search.
 */
public class SearchEngineLogger {
    public static void main(String[] args) {
        //Scanner for user input and asking the user to enter a search
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a search or X to exit: ");
        String searchItem = input.nextLine();
        //If the user enters anything other than x then it will begin the search.
        while (!searchItem.equalsIgnoreCase("X")){
            logActions("search:" +searchItem);
            System.out.println("Enter a search or X to exit: ");
            searchItem = input.nextLine();
        }
        //if the user enters X then it will exit.
        if (searchItem.equalsIgnoreCase("X")){
            logActions("exit");
        }
    }// Log action method with filewriter and BufferedWriter
    public static void logActions(String action) {
        try{
            FileWriter fw = new FileWriter("logs.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getCurrentDateTime()+ ""+ action+"\n");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
//Get current day method to print the date and time with search
    public static String getCurrentDateTime(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dtf.format(ldt);
    }
}
