package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    List<Valuable> assets = new ArrayList<>();
    public Portfolio(String name, String owner){
        this.name = name;
        this.owner = owner;
    }
    public void add(Valuable asset){
    assets.add(asset);
    }
    public double getValue(){
    double total = 0;
    for(Valuable valuable : assets){
        if(valuable instanceof CreditCard){
            total -= valuable.getValue();
        }
    }
    return total;
    }
    public Valuable getLeastValuable(){
Valuable leastValuable = assets.get(0);
for(Valuable valuable : assets){
    if(valuable.getValue()<leastValuable.getValue()){
        leastValuable = valuable;
    }
}
return leastValuable;
    }
    public Valuable getMostValuable(){
        Valuable mostValuable = assets.get(0);
        for(Valuable valuable : assets){
            if(valuable.getValue()>mostValuable.getValue()){
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

}
