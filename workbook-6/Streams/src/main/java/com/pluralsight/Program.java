package com.pluralsight;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
Person person1 = new Person("Carl","Bennet",46);
Person person2 = new Person("Tre","Kart",24);
Person person3 = new Person("Alice","Thompson",29);
Person person4 = new Person("David","Patel",25);
Person person5 = new Person("Emily", "Garcia",32);
Person person6 = new Person("Sarah","Wilson",38);
Person person7 = new Person("Michael","Chang",36);
Person person8 = new Person("Ben","Cooking",31);
Person person9 = new Person("Olivia","Murphy",45);
Person person10 = new Person("Ethan","Kim",23);
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
     /*   Scanner input = new Scanner(System.in);
        System.out.println("What name would you like to search for? First(1) or Last(2)");
        int command = input.nextInt();
        if(command == 1){
            System.out.println("Enter Name Here: ");
            String name = input.next();
            for(Person person : people){
                if(name.equals(person.getFirstName())){
                    System.out.println(person);
                }
            }
        } if (command == 2){
            System.out.println("Enter Name Here: ");
            String name = input.nextLine();
            for(Person person : people){
                if(name.equals(person.getLastName())){
                    System.out.println(person);
                }
            }
        }
*/
        //Step2
        //Calculate average age
    /*    int totalAge = 0;
        //Add all ages up
        for(Person person : people){
            totalAge += person.getAge();
        }
        //Divide total age n=by the size of the list
        int averageAge = totalAge / people.size();
        System.out.println("Average: " + averageAge);
*/
        //Step3
        //Calculate and Display the oldest person in the list
        Person oldest = Collections.max(people, Comparator.comparingInt(Person::getAge));
        System.out.println(oldest);

        //Step4
        //Calculate and display the youngest person
        Person youngest = Collections.min(people, Comparator.comparingInt(Person::getAge));
        System.out.println(youngest);
    }
}
