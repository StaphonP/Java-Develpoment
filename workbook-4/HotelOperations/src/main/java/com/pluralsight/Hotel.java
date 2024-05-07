package com.pluralsight;

public class Hotel {
private String name;
private int numberOfSuites;
private int numberOfRooms;
private int bookedSuites;
private int bookedRooms;
    public Hotel(String name,int numberOfSuites,int numberOfRooms){
        this.name = name;
        this.numberOfRooms = 12;
        this.numberOfSuites =  10;
    }
    public Hotel(String name,int numberOfSuites,int numberOfRooms,int bookedSuites,int bookedRooms){
        this.name = name;
        this.numberOfRooms = 12;
        this.numberOfSuites = 10;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }
    public boolean bookRoom(int rooms, boolean isSuite){
        if(rooms<getAvailableRooms()){
            numberOfRooms--;
        } if(isSuite) {
            if(getAvailableSuites()>rooms) {
            numberOfSuites--;
            }
        } else{
            return false;}
           return true;
    }
    public int getAvailableSuites(){
        return numberOfSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms;
    }

}