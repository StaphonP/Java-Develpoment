package com.yearup.dealership;

public class SalesContract extends Contract {
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean financed;


    public SalesContract( String date, String name, String email, boolean vehicleSold, double totalPrice,double monthlyPayment,double salesTax, double recordingFee, double processingFee, boolean financed,String vehicleInfo) {
       super(date,name,email,vehicleSold,totalPrice,monthlyPayment,vehicleInfo);
        this.salesTax = .05;
        this.recordingFee = 100;
        this.processingFee = processingFee;
        this.financed = false;

    }

    public double getSalesTax() {
        return .05;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return 100;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    @Override
    public double getTotalPrice() {
      return salesTax * recordingFee * processingFee;

}


    @Override
    public double getMonthlyPayment() {
return
    }

}

