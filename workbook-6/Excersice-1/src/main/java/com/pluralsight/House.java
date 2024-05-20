package com.pluralsight;

public class House extends Asset {
    private int yearBuilt;
    private int bedrooms;
    private int squareFeet;

    public House(int yearBuilt, int bedrooms, int squareFeet, String name, double marketValue){
        super(name,marketValue);
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public double getValue(){
        return 0;
    }
}
