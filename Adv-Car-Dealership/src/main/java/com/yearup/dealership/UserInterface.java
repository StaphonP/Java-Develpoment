package com.yearup.dealership;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    //This constructor starts the program by reading the csv file and making a new dealershp
    UserInterface(){
        init();
    }
    //Loads new dealership and instantiates it to the dealership variable
    private void init(){
        //Call Dealershipfilemanager method
        DealershipFileManager fileManager = new DealershipFileManager();
        //Pass values to "dealership"
        this.dealership =
                 fileManager.getDealership();
    }
    public void display(){
        //Call menu method
        menu();
    }
    //Helper method to display vehicles
    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        menu();
    }


   //Searches for vehicles by Price
   private void processGetByPrice(){
        //Prompt user for min and max
Scanner input = new Scanner(System.in);
        System.out.println("Enter min");
        double minPrice = input.nextDouble();
        System.out.println("Enter max");
        double maxPrice = input.nextDouble();
        // Pass the value to the getvehiclesbyPrice method
        ArrayList<Vehicle> results = dealership.getVehiclesByPrice(minPrice,maxPrice);
//If the price is in range display vehicle
        if(!results.isEmpty()) {
            //header
            System.out.println("\n -------Vehicles By Price-------\n");
            displayVehicles(results);
        } else{
            System.out.println("Sorry no vehicles found");
        }
menu();
    }

    //Searches for vehicles by Make and Model
    private void processGetByMakeModel(){
        //Prompt user for make and model
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter make: ");
        String make = input.nextLine().toLowerCase();
        System.out.println("Please enter model: ");
        String model = input.nextLine().toLowerCase();
        // Pass the value to the getvehiclesbyMake method
        ArrayList<Vehicle> results = dealership.getVehiclesByMake(make,model);
        //If the Make and model matches, display vehicle
        if(!results.isEmpty()) {
            //header
            System.out.println("\n -------Vehicles By Make-------\n");
            displayVehicles(results);
        } else {
            System.out.println("Sorry no vehicles found.");
        }
menu();
    }
    private void processGetByYear(){
//Prompt User for year
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        String year = input.nextLine();
        //Pass the value to the getVehicleBYYear method
        ArrayList<Vehicle> results = dealership.getVehiclesByYear(year);
        //If the Year matches then display vehicle
        if(!results.isEmpty()) {
            //header
            System.out.println("\n -------Vehicles By Price-------\n");
            displayVehicles(results);
        } else {
            System.out.println("Sorry no vehicles found.");
        }
        menu();
    }
    private void processGetByColor() {
//Prompt user for color
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Color: ");
        String color = input.nextLine();
        //Pass the value to the getVehicleByColor method
        ArrayList<Vehicle> results = dealership.getVehiclesByColor(color);
        //If the Color matches then display the vehicle
        if(!results.isEmpty()) {
            //header
            System.out.println("\n -------Vehicles By Color-------\n");
            displayVehicles(results);
        } else {
            System.out.println("Sorry no vehicles found.");
        }
        menu();
    }

    private void processGetByMileage(){
        //Prompt User for Mileage
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mileage: ");
        String mileage = input.nextLine();
        //Pass it to the getVehiclesByMileage method
        ArrayList<Vehicle> results = dealership.getVehiclesByMileage(mileage);
        //If mileage matches then display vehicle
        if(!results.isEmpty()){
            //header
            System.out.println("\n-------Vehicles By Mileage-------\n");
            displayVehicles(results);
        } else {
            System.out.println("Sorry no vehicles found.");
        }
        menu();
    }
    private void processGetByVehicleType(){
//Prompt User for Mileage
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Vehicle Type: ");
        String type = input.nextLine();
        //Pass it to the getVehiclesByMileage method
        ArrayList<Vehicle> results = dealership.getVehiclesByType(type);
        //If Type matches then display vehicle
        if(!results.isEmpty()){
            //header
            System.out.println("\n-------Vehicles By Type-------\n");
            displayVehicles(results);
        } else {
            System.out.println("Sorry no vehicles found.");
        }
        menu();
    }
    private void processGetAllVehicles(){
        //Call dealership method and get All Vehicles in the Arraylist
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        //Pass to helper method
        displayVehicles(vehicles);
        menu();
    }
    private void processAddVehicle(){

    }
    private void processRemoveVehicle(){

    }
    private void Quit(){

    }
    private void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n ----------Welcome to Pete's Dealership!-----------\n");
        System.out.println("How would you like to search for a car today?\n " +
                "By Price(1)\n By Make/Model(2)\n " +
                "By Year(3)\n By Color(4)\n By Mileage(5)\n By Vehicle Type(6)\n All Vehicles(7)\n Add a Vehicle\n(8)" +
                "Remove a Vehicle(9)\n Quit(0)");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> processGetByPrice();
            case 2 -> processGetByMakeModel();
            case 3 -> processGetByYear();
            case 4 -> processGetByColor();
            case 5 -> processGetByMileage();
            case 6 -> processGetByVehicleType();
            case 7 -> processGetAllVehicles();
            case 8 -> processAddVehicle();
            case 9 -> processRemoveVehicle();
            case 0 -> Quit();
            default -> System.out.println("Invalid choice! Try Again.");
        }
        scanner.close();
    }
}
