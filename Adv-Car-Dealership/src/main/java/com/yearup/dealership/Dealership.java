package com.yearup.dealership;
import java.util.ArrayList;

//Will hold information about the dealership(name,address,phone)
//Maintain list of vehicles
//Methods that search the list of vehicles
//add/remove vehicle
//*****************
public class Dealership {
    //Attributes
    private ArrayList<Vehicle> vehicles;
    private String name;
    private String address;
    private String phone;

    /*
    Initializes a Dealership object with attributes listed above
    Name, Phone number, and address of the dealership
     */
    public Dealership(String name, String address, String phone) {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.vehicles = new ArrayList<>();
    }
    /*
    When you create a new Dealership object using constructor above,
    a new empty Arraylist is created and assigned to that Dealership object.
     Dealership objects will have an inventory list of vehicles.
     */


    //Getters and setters of attributes in constructor.


    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "vehicles=" + vehicles +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    /*
    ----------Methods----------
     */

     /*
     Returns vehicles within a price range from the dealerships ArrayList
      */

    public ArrayList<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        //Create a new ArrayList to store search results
        ArrayList<Vehicle> results = new ArrayList<>();
        //Loop through the ArrayList to find vehicles in price range
        for (Vehicle vehicle : vehicles) {
            //If vehicle price falls within the range given, add it to results
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                results.add(vehicle);
            }
        }            // Return  the list of vehicles
        return results;
    }

    //Returns vehicles by Make and Model
    public ArrayList<Vehicle> getVehiclesByMake(String make, String model) {
        //Create a new ArrayList to store search results
        ArrayList<Vehicle> results = new ArrayList<>();
        //Loop through the ArrayList to find vehicles in price range
        for (Vehicle vehicle : vehicles) {
            //If vehicles make and model match the values given then add it to results
            if (vehicle.getMake().toLowerCase().contains(make)
                    || vehicle.getModel().toLowerCase().contains(model)) {
                results.add(vehicle);
            }
        }    //Return  the list of vehicles
        return results;
    }



    //Returns vehicles by Year
    public ArrayList<Vehicle> getVehiclesByYear(String year) {
        // Create a new ArrayList to store search results
        ArrayList<Vehicle> results = new ArrayList<>();
        // Loop through the ArrayList to find vehicles with the given year
        for (Vehicle vehicle : vehicles) {
            //If the vehicles year matches the given year, add it to the results list
            if (vehicle.getYear() == year) {
                results.add(vehicle);
            }
        }    // Return the results list
        return results;
    }


         //Returns Vehicles by Color
    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        // Create a new ArrayList to store search results
        ArrayList<Vehicle> results = new ArrayList<>();
        // Loop through the ArrayList to find vehicles with the given year
        for (Vehicle vehicle : vehicles) {
            //If the vehicles color matches the given color, add it to the results list
            if (vehicle.getColor().toLowerCase().contains(color)) {
                results.add(vehicle);
            }
        }    // Return the results list
        return results;
    }



      //Returns vehicles by mileage
    public ArrayList<Vehicle> getVehiclesByMileage(String mileage) {
        // Create a new ArrayList to store search results
        ArrayList<Vehicle> results = new ArrayList<>();
        // Loop through the ArrayList to find vehicles with the given mileage
        for (Vehicle vehicle : vehicles) {
            //If the vehicles mileage matches the given mileage, add it to the results list
            if (vehicle.getOdometer() == mileage) {
                results.add(vehicle);
            }
        }
        // Return the results list
        return results;
    }


    //Returns Vehicles by Type
        public ArrayList<Vehicle> getVehiclesByType(String type){
        //Create a new ArrayList to store search results
            ArrayList<Vehicle> results  = new ArrayList<>();
            //Loop through the ArrayList to find the vehicles with the given type
            for (Vehicle vehicle : vehicles){
                //If the vehicles type matches the given type, add it to the results
                if(vehicle.getVehicleType().toLowerCase().contains(type)) {
                    results.add(vehicle);
                }
            }      //Return the results list
                 return results;
        }



        //Returns All Vehicles
        public ArrayList<Vehicle> getAllVehicles(){
           //Create new ArrayList to store results
            ArrayList<Vehicle> results = new ArrayList<>();
             // Loop through the ArrayList to get All Vehicles
            for(Vehicle vehicle : vehicles)  {
                //Add every vehicle to the results
                results.add(vehicle) ;
            }           //Return results
                 return results;
        }


        //Add Vehicle
        public  void addVehicle(Vehicle vehicle)   {
        //Add the vehicle to Arraylist
            this.vehicles.add(vehicle);
        }


        //Remove Vehicle
        public void removeVehicle(Vehicle vehicle){
            //Remove vehicle
        this.vehicles.remove(vehicle);
        }

}