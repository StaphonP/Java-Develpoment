package com.yearup.dealership;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContractDataManager {

    //Method to overwrite the csv file
    public void saveContract(Contract contract) {


        try {
            //Create a writer object
            BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv", true));
            //If contract is a Sales Contract then assign the Sales Contract variables
                if (contract instanceof SalesContract){
                    //assign contract as a lease contract to retrieve its properties and variables
                    SalesContract salesContract = (SalesContract) contract;
                    //Pull variables that the user puts in using getters. and assigning them to the ones I created.
                    String date = salesContract.getDate();
                    String name = salesContract.getName();
                    String email = salesContract.getEmail();
                   double processingFee = salesContract.getProcessingFee();
                   double salesTax = salesContract.getSalesTax();
                   double recordingFee = salesContract.getRecordingFee();
                   double totalPrice = salesContract.getTotalPrice();
                   boolean isFinanced = salesContract.isFinanced();
                   String vehicleInfo = salesContract.getVehicleInfo();
                   //Append to contracts file
                    writer.write(new StringBuilder().append("Sale|").append(date).append("|")
                            .append(name).append("|").append(email).append("|")
                            .append(totalPrice).append("|").append(vehicleInfo)
                            .append("|").append(isFinanced).append("|")
                            .append(recordingFee).append("|").append(salesTax).append("|").append(processingFee).toString());
                } else if (contract instanceof LeaseContract){
                    //assign contract as a lease contract to retrieve its properties and variables
                    LeaseContract leaseContract = (LeaseContract) contract;
                    //Pull variables that the user inputs by using getters and assign them to the ones I created.
                    String date = leaseContract.getDate();
                    String name = leaseContract.getName();
                    String email = leaseContract.getEmail();
                    double totalPrice = leaseContract.getTotalPrice();
                    double monthlyPayment = leaseContract.getMonthlyPayment();
                    double expectedValue = leaseContract.getExpectedValue();
                    double leaseFee = leaseContract.getLeaseFee();
                    String vehicleInfo = leaseContract.getVehicleInfo();
                    //Append to contracst file
                    writer.write(new StringBuilder().append("Lease| ").append(date).append("|")
                            .append(name).append("|").append(email).append("|")
                            .append(totalPrice).append("|").append(vehicleInfo)
                            .append("|").append(monthlyPayment).append("|")
                            .append(expectedValue).append("|").append(leaseFee).toString());
            }


        } catch (IOException e) {
            System.out.println("Error Saving File.");
            e.printStackTrace();
        }
    }
}
