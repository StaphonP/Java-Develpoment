package com.yearup.dealership;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public abstract class Contract {
private String date;
private String name;
private String email;
private boolean vehicleSold;
private double totalPrice;
private double monthlyPayment;
private String vehicleInfo;

    public Contract(String date, String name, String email, boolean vehicleSold, double totalPrice, double monthlyPayment, String vehicleInfo) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
        this.vehicleInfo = vehicleInfo;
    }

    public String getDate() {
         LocalDateTime date = LocalDateTime.now();
        return String.valueOf(date);
    }

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
public abstract double getTotalPrice();
public abstract double getMonthlyPayment();


}
