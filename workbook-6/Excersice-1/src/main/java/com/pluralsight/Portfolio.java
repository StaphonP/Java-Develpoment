package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    ArrayList<Asset> assets = new ArrayList<>();
    public Portfolio(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void addAsset(Asset assets){
        addAsset(assets);
    }
    public double getValue(){
return 0;
    }
}
