package com.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hours;


    public Employee(String employeeId, String name, String department, double payRate, double hours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hours = hours;
    }
    public Employee(){
        this.employeeId = "";
        this.name = "";
        this.department = "";
        this.payRate = 0.0;
        this.hours = 0.0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getTotalPay(){
        return payRate*hours;
    }
    public double getRegularHours(){
        if(hours >= 40) {
            return 40;
        } else if(hours<=40){
            return hours;
        }
        return 0;
    }
    public double getOvertimeHours(){
        if(hours>40){
            return hours-40;
        }
            return 0;
    }
    private LocalDateTime punchInTime;
    private LocalDateTime punchOutTime;
    private boolean isPunchedIn;
    public void punchIn(){
        if (!isPunchedIn) {
            punchInTime = LocalDateTime.now();
            isPunchedIn = true;
            System.out.println("Punched in at: " + punchInTime);
        } else {
            System.out.println("Already punched in.");
        }
    }
    public void punchOut(){
        if (isPunchedIn) {
            punchOutTime = LocalDateTime.now();
            isPunchedIn = false;
            System.out.println("Punched out at: " + punchOutTime);
            double hours = Duration.between(punchInTime, punchOutTime).toHours();
            System.out.println("Punched in at: "+punchInTime+"\n Punched out at: "+punchOutTime+
                    "\n Hours Worked: "+ hours);
        } else {
            System.out.println("Can't punch out. Not punched in.");
        }

    }
public String getPunchInTime(){
        return String.valueOf(punchInTime);
}
public String getPunchOutTime(){
        return String.valueOf(punchOutTime);
}
    
    }

