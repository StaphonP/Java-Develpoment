package com.yearup.dealership;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;


/* Responsible for reading the dealership file,Parsing the data,
 and creating a Dealership object full of vehicles from the file

 */
public class DealershipFileManager {



    //Reads inventory data from a csv file the fills Dealership object
    public Dealership getDealership() {
      //
        Dealership dealership = null;
        try {
            //Create a new Buffered reader
            BufferedReader reader = new BufferedReader(new FileReader("inventoryv2.csv"));
            String headerLine;

           headerLine = reader.readLine();// Reads first line of file and doesn't include it in the object.
            String[] tokens = headerLine.split(Pattern.quote("|"));
          dealership = new Dealership(tokens[0], tokens[1], tokens[2]);
          String line;
            while((line = reader.readLine()) != null){
                String[] tokens2 = line.split(Pattern.quote("|"));
                if (tokens2.length == 8){ //parts in file
                    //Variables are read from file, assigned and put in order to create an object.
                    int vin = Integer.parseInt(tokens2[0]);
                    String year = tokens2[1];
                    String make = tokens2[2];
                    String model = tokens2[3];
                    String vehicleType = tokens2[4];
                    String odometer = tokens2[5];
                    String color = tokens2[6];
                    double price = Double.parseDouble(tokens2[7]);

                    //Create object
                    Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                    //Add object to ArrayList

                    dealership.addVehicle(vehicle);
                }
                }
            //Fill the dealership inventory array with new cars

            reader.close();

    } catch (IOException e){
            System.out.println("Error! File can't be read.");
            e.printStackTrace();
        }
//Return new Dealership object
        return dealership;
    }



    //Saves the inventory of a Dealership object to a csv file
    public void saveDealership(Dealership dealership) {
    try{
        //Create reference ArrayList that gets All current vehicles from dealershio.
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        //Create New Writer
        BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.csv", false)); //Create new file that will overwrite when written to
        //Write Headers
        writer.write(dealership.getName() + "|" + dealership.getPhone() + "|" + dealership.getAddress() + "\n");
        //Write vehicle using getters
        for(Vehicle vehicle: vehicles) {
            writer.write(
                    vehicle.getVin() + "|" +
                            vehicle.getYear() + "|" +
                            vehicle.getMake() + "|" +
                            vehicle.getModel() + "|" +
                            vehicle.getVehicleType() + "|" +
                            vehicle.getColor() + "|" +
                            vehicle.getOdometer() + "|" +
                            vehicle.getPrice() + "\n" );
        }
        //Writer close
        writer.close();
    } catch (IOException e) {
        System.out.println("Error!");
        e.printStackTrace();
    }
    }
}
