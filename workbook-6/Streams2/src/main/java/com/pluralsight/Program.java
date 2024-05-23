package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Carl", "Bennet", 46);
        Person person2 = new Person("Tre", "Kart", 24);
        Person person3 = new Person("Alice", "Thompson", 29);
        Person person4 = new Person("David", "Patel", 25);
        Person person5 = new Person("Emily", "Garcia", 32);
        Person person6 = new Person("Sarah", "Wilson", 55);
        Person person7 = new Person("Michael", "Chang", 36);
        Person person8 = new Person("Ben", "Cooking", 31);
        Person person9 = new Person("Olivia", "Murphy", 45);
        Person person10 = new Person("Ethan", "Kim", 23);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

//Step1
  /*      Scanner input = new Scanner(System.in);
        System.out.println("What name would you like to search for? First(1) or Last(2)");
        int command = input.nextInt();
        if (command == 1) {
            System.out.println("Enter Name Here: ");
            String name = input.next();
            List<Person> matchingPeople = people.stream()
                    .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
            System.out.println(matchingPeople);
        }
        if (command == 2) {
            System.out.println("Enter Name Here: ");
            String name = input.next();
            List<Person> matchingPeople = people.stream()
                    .filter(person -> person.getLastName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
            System.out.println(matchingPeople);

        }
        */
        //add all ages to a list
       List<Integer> ages = people.stream()
                .map(Person::getAge)
               .toList();
        //Stream through the list above
        int averageAge = ages.stream()
                //Get sum of all integers(ages) in the list and then divide it by the six=ze of the list above(ages size)
                .reduce(0, Integer::sum) / ages.size();
        //print
        System.out.println("Average Age: " + averageAge);


List<Person> oldestPerson = people.stream()
        //Stream through the arraylist and find the max of  Ages. Using Comparator
        .max(Comparator.comparing(Person::getAge))
        //add the person with the highest age into the new list
        .stream().toList();
//print
        System.out.println(oldestPerson);

        List<Person> youngestPerson = people.stream()
                //Stream through the arraylist and find the min of  Ages. Using Comparator
                .min(Comparator.comparing(Person::getAge))
                //add the person with the lowest age into the new list
                .stream().toList();
//print
        System.out.println(youngestPerson);

    }

       }




