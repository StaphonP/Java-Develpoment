package com.pluralsight;
/* Employee class holding private attributes employeeId, name, hoursWorked, and payRate
  Also holds Constructor, and Getters and Setters plus 'getGrossPay' method.
   */
public class Employee  {
    private int employeeId;
    private String name;
    private int hoursWorked;
    private double payRate;
    private double grossPay;

    public Employee(int employeeId, String name, int hoursWorked, double payRate) {
        this.name = name;
        this.hoursWorked= hoursWorked;
        this.payRate = payRate;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                ", grossPay=" + getGrossPay() +
                '}';
    }

    // Getters and setters
    public double getGrossPay(){
        return (hoursWorked*payRate);

    }
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}