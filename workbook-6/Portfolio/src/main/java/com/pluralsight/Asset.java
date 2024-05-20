package com.pluralsight;

public abstract class Asset implements Valuable {
    private String name;
    private double marketValue;
    public Asset(String name, double marketValue){
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public void getValue(double marketValue){

    }

}
