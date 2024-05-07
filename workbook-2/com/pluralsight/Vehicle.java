package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometer;
    private float price;

    //Constructor
    public Vehicle() {
        this.vehicleId=0;
        this.makeModel="";
        this.color="";
        this.odometer =0;
        this.price = 0.0f;
    }
    public Vehicle(long vehicleId, String makeModel,String color, int odometer, float price){
        this.vehicleId=vehicleId;
        this.makeModel=makeModel;
        this.color=color;
        this.odometer=odometer;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }


    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
