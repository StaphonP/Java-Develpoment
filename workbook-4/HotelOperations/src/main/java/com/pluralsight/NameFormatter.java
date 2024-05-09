package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){

    }
    public static void formatName(String firstName,String lastName){
       System.out.println((lastName+" "+firstName));
    }
    public static void formatName(String prefix,String firstName,
                                    String middleName,String lastName,
                                    String suffix){
        System.out.println((lastName + " " + prefix + " " + " " + firstName +" "+ middleName +", "+ suffix));
    }
    public static void formatName(String fullName){
        String[] names = fullName.split(" ");
        String prefix = names[0];
        String firstName = names[1];
        String middleName = names[2];
        String lastName = names[3];
        String suffix = names[4];
        System.out.println((prefix+" "+firstName+" "+middleName+" "+lastName+", "+suffix));
    }
}
