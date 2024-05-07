package com.pluralsight;

public class Reservation {
    private String roomType;

    private int nights;
    private boolean isWeekend;



    public Reservation(String roomType, int nights, boolean isWeekend) {
        this.roomType = roomType;
        this.nights = nights;
        this.isWeekend = isWeekend;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if(roomType.equals("king")){
            if(isWeekend)
                return 139.00*1.10;
            return 139.00;
        }
        else if(roomType.equals("double")){
            if(isWeekend)
                return 124.00*1.10;
            return 124.00;
        }
        return 0;
    }



    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getTotal() {
       return getPrice()*nights;
    }

}
