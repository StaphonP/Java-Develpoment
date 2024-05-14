package com.pluralsight;

public class Vehicle {
    private String color;
   private int passengerCapacity;
    private int cargoCapacity;
    private int fuelCapacity;
    public Vehicle(String color,int passengerCapacity,int cargoCapacity, int fuelCapacity){
        this.color = color;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "color='" + color + '\'' +
                ", numberOfPassengers=" + passengerCapacity +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
