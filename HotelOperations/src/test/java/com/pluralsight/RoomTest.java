package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_beOccupiedAndDirty() {

        // arrange
        // (int numberOfBeds, double price, boolean occupied, boolean dirty)
        // room is not occupied and not dirty
        Room theRoom = new Room(2, 100, false, false);

        // act
        // calling check in method for when guest checks in
        // once guest checks in, it is now occupied and dirty
        theRoom.checkIn();

        // assert
        assertTrue(theRoom.isOccupied());
        assertTrue(theRoom.isDirty());
        assertFalse(theRoom.isAvailable());

    }

    @Test
    public void checkOut_should_beUnoccupiedAndKeptDirty() {
        // arrange
        // room is dirty and occupied since guest checked in
        Room theRoom = new Room(2, 100, true, true);

        // act
        // checkout method for when guest checks out
        theRoom.checkOut();

        // assert
        // the room is no longer occupied after guest checks out
        // it is marked "dirty" and not available yet since it is dirty, room has to be cleaned
        assertFalse(theRoom.isOccupied());
        assertTrue(theRoom.isDirty());
        assertFalse(theRoom.isAvailable());

    }

    @Test
    public void cleanRoom_should_cleanRoomWhenNotOccupied() {
        // arrange
        // room is not occupied but IS dirty
        Room theRoom = new Room(2, 100, false, true);

        // act
        // calling clean room method, will need to set dirty = false to clean
        theRoom.cleanRoom();

        // assert
        // setting dirty = false to clean room
        assertFalse(theRoom.isDirty());
        // room is now available once it has been cleaned, set this to true
        assertTrue(theRoom.isAvailable());

    }
}