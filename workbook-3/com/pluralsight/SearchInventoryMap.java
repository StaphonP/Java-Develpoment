package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {
    // the key is the product id, the value is a product object

    static HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();


  public static void main(String[] args) {
      HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();
      Product Hammer=new Product(1234,"Hammer",19.49f);
      Product Nails= new Product(2345,"Box of nails", 9.29f);
      Product Screwdriver= new Product(9154,"9-in-one Screwdriver", 24.97f);
      Product wrench=new Product(1648, "Crescent Wrench(10 in)", 15.95f);
      Product toolset=new Product(9876, "Mechanics Tool Set", 119.00f);
      Product springClamp=new Product(1212,"Spring Clamp", .99f);
      Product triggerClamps=new Product(3434,"Large Trigger Clamps", 36.97f);
      inventory.put(2345,Nails);
      inventory.put(9154,Screwdriver);
      inventory.put(1648, wrench);
      inventory.put(9876,toolset);
      inventory.put(1212,springClamp);
      inventory.put(3434, triggerClamps);
      inventory.put(1234,Hammer);
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String inventory = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

