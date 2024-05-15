package AssetManager.src.main.java.com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "description='" + description + '\'' +
                ", dateAcquired='" + dateAcquired + '\'' +
                ", originalCost=" + originalCost +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    public double getValue(){
        return originalCost;
    }

    public static void main(String[] args) {
        //New Arraylist for all Assets
        List<Asset> assets = new ArrayList<>();
        //Make new  Asset objects
        Asset vacationHome = new House("123 Beach Road", 3, 145,1000,"Vacation Home", "03-07-22", 400000);
        Asset home = new House("123 Home Road", 4, 185,2000,"My House", "02-11-16", 750000);
        Asset car1 = new Vehicle("SRT Jeep Cherokee",2023,70000," My Track Hawk","02-04-21",80000);
        Asset car2 = new Vehicle("Bmw M4",2019,80000,"My BMW","09-14-22",90000);
        //Add assets to the arraylist above
            assets.add(vacationHome);
            assets.add(home);
            assets.add(car1);
            assets.add(car2);
//Loop through array list and only display the description, date aquired, Cost and value.
        for(Asset asset: assets){
            System.out.println("Description : " + asset.getDescription() + " Date Acquired: " + asset.getDateAcquired() + " Cost: " + asset.getOriginalCost() + "\n Asset Value: " + asset.getValue());
        }

    }
}
