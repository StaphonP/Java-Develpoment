package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        /*Declaring variables and assigning them the show the current time
         */
        LocalDateTime today = LocalDateTime.now();
        ZoneId gmtZoneId = ZoneId.of("GMT");
        ZonedDateTime gmtDateTime = today.atZone(gmtZoneId);

// All 4 different formats for the print out of dates

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        //Formatting the current day in the format that we assign it to
        String firstDate = today.format(formatter1);
        String secondDate = today.format(formatter2);
        String thirdDate = today.format(formatter3);
        String fourthDate = gmtDateTime.format(formatter4);
     //Printing out results

        System.out.println(firstDate);
        System.out.println(secondDate);
        System.out.println(thirdDate);
        System.out.println(fourthDate);
    }
}
