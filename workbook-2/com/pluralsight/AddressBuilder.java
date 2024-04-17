package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String billingStreet, billingCity , billingState;
        String billingZip;
        System.out.println("Enter Full Name: ");
        String name = input.nextLine();
        System.out.println("Billing Street: ");
        billingStreet = input.nextLine();
        System.out.println("Billing City: ");
        billingCity = input.nextLine();
        System.out.println("Billing State: ");
        billingState = input.nextLine();
        System.out.println("Billing Zip");
        billingZip = input.nextLine();
     String shippingStreet,shippingCity,shippingState;
        System.out.println("Now enter Shipping Address.");
     String shippingZip;
        System.out.println("Shipping Street: ");
        shippingStreet = input.nextLine();
        System.out.println("Shipping City: ");
        shippingCity = input.nextLine();
        System.out.println("Shipping State: ");
        shippingState = input.nextLine();
        System.out.println("Shipping Zip");
        shippingZip = input.next();
         StringBuilder billingAddress = new StringBuilder();
                 billingAddress.append(billingStreet+"\n");
                 billingAddress.append(billingCity+", ");
                 billingAddress.append(billingState+" ");
                 billingAddress.append(billingZip);
                 String billing = billingAddress.toString();

                 StringBuilder shippingAddress = new StringBuilder();
                 shippingAddress.append(shippingStreet+"\n");
                 shippingAddress.append(shippingCity+",");
                 shippingAddress.append(shippingState+" ");
                 shippingAddress.append(shippingZip);
                 String shipping = shippingAddress.toString();

                 System.out.println("Full Name: "+name);
                 System.out.println("Billing Address:\n "+billing);
                 System.out.println("Shipping Address:\n "+shipping);



    }

}
