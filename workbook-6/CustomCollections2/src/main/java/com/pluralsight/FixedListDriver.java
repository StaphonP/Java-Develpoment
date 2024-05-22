package com.pluralsight;

import java.time.LocalDate;

public class FixedListDriver {
    public static void main(String[] args) {
       FixedList<Integer> numbers = new FixedList<Integer>(4);
        numbers.add(23);
        numbers.add(43);
        numbers.add(32);
        numbers.add(9);
        numbers.add(60);

      System.out.println(numbers.getItems().size());
FixedList<LocalDate> dates = new FixedList<LocalDate>(2);
dates.add(LocalDate.now());
dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        System.out.println(dates.getItems().size());
    }
}
