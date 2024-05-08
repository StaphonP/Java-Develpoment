package com.pluralsight;

public class Reservation {

Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    private int nights;
    private boolean isWeekend;



    public Reservation( int nights, boolean isWeekend) {
        this.nights = nights;
        this.isWeekend = isWeekend;
        room = null;

    }



    public double getPrice() {
        if(room.getRoomType().equals("Suite")){
            if(isWeekend)
                return 139.00*1.10;
            return 139.00;
        }
        else if(room.getRoomType().equals("Room")){
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
