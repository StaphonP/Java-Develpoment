package com.pluralsight;

public abstract class Asset {
    private String name;
    private double marketValue;
    public Asset(String name, double marketValue){
        this.name = name;
        this.marketValue = marketValue;
    }
    public double getValue(){
        return 0;
    }

}
