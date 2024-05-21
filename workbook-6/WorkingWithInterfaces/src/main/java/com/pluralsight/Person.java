package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public  Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                firstName +
                " " + lastName + " " +
                 age;
    }

    public int compareTo(Person p) {
        if(lastName.equals(p.lastName))
            if(firstName.equals(p.firstName))
            return 0;
        else if (firstName.compareTo(p.firstName)>0)
            return 1;
        else
            return -1;
        else if (lastName.compareTo(p.lastName)>0)
            return 1;
        else return -1;


    }

}
