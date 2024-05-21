package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Staphon", "Peterson", 21));
        myFamily.add(new Person("Wendy","Douglas",43));
        myFamily.add(new Person("Tre","Peterson",15));
        myFamily.add(new Person("Sanii","Peterson",20));
        myFamily.add(new Person("Yoshi","Kendrick",23));
        myFamily.add(new Person("Thurman","Peterson",41));
        Collections.sort(myFamily);
        System.out.println(myFamily);
    }

}