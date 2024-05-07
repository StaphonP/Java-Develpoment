package com.pluralsight;

public class Hotel {
private String name;
private int numberOfSuites;
private int numberOfRooms;
private int bookedSuites;
private int bookedRooms;
    public Hotel(String name,int numberOfSuites,int numberOfRooms){
        this.name = name;
        this.numberOfRooms = 0;
        this.numberOfSuites =  0;
    }
    public Hotel(String name,int numberOfSuites,int numberOfRooms,int bookedSuites,int bookedRooms){
        this.name = name;
        this.numberOfRooms = 0;
        this.numberOfSuites = 0;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }
    public boolean bookRoom(int rooms, boolean isSuite){
       if(isSuite){
           if((numberOfSuites > bookedSuites)&& (numberOfRooms <= numberOfSuites - bookedSuites)){
               bookedSuites += numberOfSuites;
               return true;

           } else {
               return false;
           }
       } else{
           if(numberOfRooms<=numberOfRooms - bookedRooms){
               bookedRooms += numberOfRooms;
               return true;
           }else{
               return false;
           }
       }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms - bookedRooms;
    }

}