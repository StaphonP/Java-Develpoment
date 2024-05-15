package AssetManager.src.main.java.com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Vehicle extends Asset {
    //Attriutes
    private String makeModel;
    private int year;
    private int odometer;
    //Constructor calling the super method from the Asset class

    public Vehicle(String makeModel, int year, int odometer,String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "makeModel='" + makeModel + '\'' +
                ", year=" + year +
                ", odometer=" + odometer +
                '}';
    }

    //Getters and Setters
    public String getMakeModel() {
        return makeModel;
    }


    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    /* Method to calculate how old a vehicle is.
    Tells you the reduction of cost per year based on age of Car

     */
    public double getValue() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int carYear = getYear();
        int carAge = currentYear - carYear;
        if (carAge <= 3) {
            System.out.println(carAge + " years old - 3% reduced value of cost per year ");
        } else if (carAge >= 4 && carAge <= 6) {
            System.out.println(carAge + " years old - 6% reduced value of cost per year ");
        } else if (carAge >= 7 && carAge <= 10) {
            System.out.println(carAge + " years old - 8% reduced value of cost per year ");
        } else if (carAge > 10) {
            System.out.println(carAge + " years old - -$1000.00 reduced value of cost per year ");
        }
        return carAge;
    }
    }


