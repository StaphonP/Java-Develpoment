package com.yearup.dealership;

public class LeaseContract extends Contract{
    private double expectedValue;
    private double leaseFee;

    public LeaseContract(String date, String name, String email, boolean vehicleSold, double totalPrice, double monthlyPayment,double expectedValue, double leaseFee, String vehicleInfo) {
        super(date, name, email, vehicleSold, totalPrice, monthlyPayment,vehicleInfo);
        this.expectedValue = expectedValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(double expectedValue) {
        this.expectedValue = expectedValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {

    }
}
