package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;


public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone first = new CellPhone();


        System.out.println("Enter Serial Number: ");
       first.setSerialNum(Long.parseLong(input.nextLine()));

        System.out.println("Enter model of Phone: ");
        first.setModel(input.nextLine());

        System.out.println("Enter carrier: ");
        first.setCarrier(input.nextLine());

        System.out.println("Enter Phone Number: ");
        first.setPhoneNum(input.nextLine());

        System.out.println("Owner of Phone: ");
        first.setOwner(input.nextLine());

        CellPhone second = new CellPhone();
        second.setPhoneNum(second.getPhoneNum());
        second.setCarrier(second.getCarrier());
        second.setOwner(second.getOwner());
        second.setSerialNum((long) second.getSerialNum());
        second.setOwner(second.getOwner());
        display(first);
        display(second);

        System.out.println("Serial Number is: " + first.getSerialNum());
        System.out.println("Model: " + first.getModel());
        System.out.println("Carrier: "+ first.getCarrier());
        System.out.println("Phone Number: "+ first.getPhoneNum());
        System.out.println("Owner: " + first.getOwner());

        first.dial(second.getPhoneNum());
        second.dial(first.getPhoneNum());





    }

    private static void display(CellPhone phone){
        String details = phone.getOwner()+" owns this phone "+phone.getPhoneNum()+" and their carrier is "
                +phone.getCarrier()+". The serial number is "+ phone.getSerialNum()+ " and the model is "+phone.getModel();
        System.out.println(details);

    }

}
