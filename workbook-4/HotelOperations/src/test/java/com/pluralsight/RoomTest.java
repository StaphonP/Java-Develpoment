package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
     void checkIn_Should_checkIn() {
        //set up
        Room room = new Room(1,"king",false,false,true);
        boolean expectedOccupied = true;
        boolean expectedDirty = true;
        boolean actualOccupied = room.isOccupied();
        boolean actualDirty = room.isDirty();
       // act
        room.checkIn();
        //assert
        assertEquals(expectedOccupied,actualOccupied);
        assertEquals(expectedDirty,actualDirty);


    }

    @org.junit.jupiter.api.Test
    void shouldCheckOut() {
        Room room = new Room(1,"king",true,true,false);

        boolean expectedOccupied = false;
        boolean expectedDirty = false;
        boolean actualOccupied = room.isOccupied();
        boolean actualDirty = room.isDirty();

        room.checkOut();
        assertEquals(expectedOccupied,actualOccupied);
        assertEquals(expectedDirty,actualDirty);
    }

    @org.junit.jupiter.api.Test
    void shouldCleanRoom() {
        Room room = new Room();
        assertEquals(room.cleanRoom(),true);
    }
}