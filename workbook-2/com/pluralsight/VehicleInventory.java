package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        Scanner input = new Scanner(System.in);
        int counter = 6;
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        System.out.println("What do you want to do?");
        System.out.println("1- List all vehicles");
        System.out.println("2- Search by make/model");
        System.out.println("3- Search by price range");
        System.out.println("4- Search by color");
        System.out.println("5- Add a vehicle");
        System.out.println("6- Quit");
        System.out.println("Enter your command: ");
        int command = input.nextInt();
       while (command != 6) {
            switch (command) {
                case 1:
                    listAllVehicles(vehicles);
                    break;
                case 2:
                    findByMakeModel(vehicles);
                    break;
                case 3:
                    searchPrice();
                    break;
                case 4:
                    searchColor(vehicles);
                    break;
                case 5:
                    addVehicle(vehicles);
                    break;
                case 6:
                    quit();
                    return;
            }

        }
    }

    private static void quit() {
    }

    private static void addVehicle(Vehicle[] vehicles, Vehicle vehicle) {
        for(int i = 0; i< vehicles.length;i++){
            if(vehicles[i] ==null){
             vehicles[i] = vehicle;
                break;
        }
    }
    }
    private static void searchColor(Vehicle[] vehicles) {

    }

    private static void searchPrice(Vehicle[] vehicles,String price) {
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getPrice()&&.equals(price)){

            }
        }
    }
    private static void findByMakeModel(Vehicle[] vehicles, String make){
                    for (Vehicle vehicle : vehicles) {
                        if(vehicle.getMakeModel() && .equals(make)){
                            System.out.println(vehicle);
                            break;
                        }
                    }

                    }
    private static void listAllVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle: vehicles){
            if(vehicles!=null){
                System.out.println(vehicle);
                break;
            }
        }
    }
}