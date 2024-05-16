package com.yearup.dealership;

//Holds informaion about a specific vehicle
public class Vehicle {
private int vin;
private String year;
private String make;
private String model;
private String vehicleType;
private String color;
private String odometer;
private double price;

public Vehicle(int vin,String year,String make,String model,String vehicleType,
               String color, String odometer,double price){
    this.vin = vin;
    this.year = year;
    this.make = make;
    this.model = model;
    this.vehicleType = vehicleType;
    this.color = color;
    this.odometer = odometer;
    this.price = price;
}
public Vehicle(){

}

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", odometer='" + odometer + '\'' +
                ", price=" + price +
                '}';
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }
}
